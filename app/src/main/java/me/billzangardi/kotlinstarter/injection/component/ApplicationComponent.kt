package me.billzangardi.kotlinstarter.injection.component

import android.app.Application
import android.content.Context
import dagger.Component
import me.billzangardi.kotlinstarter.injection.ApplicationContext
import me.billzangardi.kotlinstarter.injection.module.ApplicationModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {

    @ApplicationContext
    fun context(): Context

    fun application(): Application
}
