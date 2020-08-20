buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        maven { url = uri("https://dl.bintray.com/kotlin/kotlin-eap") }
        maven { url = uri("https://kotlin.bintray.com/kotlinx") }
    }
    dependencies {
        classpath(Plugin.kotlin)
        classpath(Plugin.gradle)
        classpath(Plugin.navigationArgs)
    }
}
group = "com.octopus.ejplayground"
version = "1.0-SNAPSHOT"

allprojects {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        google()
        jcenter()
        maven { url = uri("https://dl.bintray.com/kotlin/kotlin-eap") }
        maven { url = uri("https://kotlin.bintray.com/kotlinx") }
    }
}
