package com.octopus.ejplayground.di

import com.octopus.ejplayground.App
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Component(
    modules = [
        AndroidInjectionModule::class,
        AndroidSupportInjectionModule::class,
        SingleActivityModule::class,
        ServicesModule::class,
        PlatformModule::class
    ]
)
interface AndroidPlaygroundComponent : AndroidInjector<App> {

    @Component.Builder
    interface Builder {
        fun build(): AndroidPlaygroundComponent
    }
}