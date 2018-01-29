package me.billzangardi.kotlinstarter.injection.module

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import me.billzangardi.kotlinstarter.data.services.SampleApi
import me.billzangardi.kotlinstarter.data.services.SampleApiFactory
import me.billzangardi.kotlinstarter.injection.ApplicationContext
import javax.inject.Singleton

@Module
class ApplicationModule(private val mApplication: Application) {

    @Provides
    internal fun provideApplication(): Application {
        return mApplication
    }

    @Provides
    @ApplicationContext
    internal fun provideContext(): Context {
        return mApplication
    }

    @Provides
    @Singleton
    internal fun provideBitgrailApi(): SampleApi {
        return SampleApiFactory.makeStarterService()
    }
}
