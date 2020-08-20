import com.android.build.gradle.internal.tasks.factory.dependsOn
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
    kotlin("multiplatform")
    kotlin("plugin.serialization") version "1.4.0"
    id("com.android.library")
    id("kotlin-android-extensions")
}
group = "com.octopus.ejplayground"
version = "1.0-SNAPSHOT"

kotlin {
    android()
    iosX64("ios") {
        binaries {
            framework {
                baseName = "shared"
            }
        }
        compilations {
            val main by getting {
                kotlinOptions.freeCompilerArgs = listOf("-Xobjc-generics")
            }
        }
    }
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
                implementation(KmpLibrary.serialisation)
                implementation(KmpLibrary.coroutinesCore)
                implementation(KmpLibrary.ktor)
                implementation(KmpLibrary.ktorJson)
                implementation(KmpLibrary.ktorSerialisation)
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }
        val androidMain by getting {
            dependencies {
                implementation(kotlin("stdlib-jdk7"))
                implementation(KmpLibrary.serialisation)
                implementation(AndroidLibrary.javaInject)
                implementation(AndroidLibrary.annotations)
                implementation(AndroidLibrary.ktorOkHttpEngine)
                implementation(KmpLibrary.ktorSerialisation)
            }
        }
        val iosMain by getting {
            dependencies {
                implementation(KmpLibrary.serialisation)
                implementation(KmpLibrary.ktorSerialisation)
                implementation(NativeLibrary.ktorClientEngine)
            }
        }
    }

    targets.all {
        compilations.all {
            kotlinOptions {
                freeCompilerArgs = freeCompilerArgs + "-Xopt-in=kotlin.ExperimentalStdlibApi"
                freeCompilerArgs = freeCompilerArgs + "-Xopt-in=kotlinx.coroutines.ExperimentalCoroutinesApi"
                freeCompilerArgs = freeCompilerArgs + "-Xopt-in=kotlinx.coroutines.FlowPreview"
                freeCompilerArgs = freeCompilerArgs + "-Xopt-in=kotlin.time.ExperimentalTime"
                freeCompilerArgs = freeCompilerArgs + "-Xopt-in=kotlin.serialization.UnstableDefault"
            }
        }
    }
}

android {
    compileSdkVersion(Config.compileSdk)
    defaultConfig {
        minSdkVersion(Config.minSdk)
        targetSdkVersion(Config.targetSdk)
        versionCode = Config.versionCode
        versionName = Config.versionName
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

val packForXcode by tasks.creating(Sync::class) {
    group = "build"
    val mode = System.getenv("CONFIGURATION") ?: "DEBUG"
    val framework = kotlin.targets.getByName<KotlinNativeTarget>("ios").binaries.getFramework(mode)
    inputs.property("mode", mode)
    dependsOn(framework.linkTask)
    project.logger.lifecycle(buildDir.toString())
    val targetDir = File(buildDir, "xcode-frameworks")
    from({ framework.outputDirectory })
    into(targetDir)
}
tasks.getByName("build").dependsOn(packForXcode)