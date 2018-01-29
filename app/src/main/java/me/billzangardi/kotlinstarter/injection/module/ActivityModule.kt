package me.billzangardi.kotlinstarter.injection.module

import android.app.Activity
import android.content.Context
import dagger.Module
import dagger.Provides
import me.billzangardi.kotlinstarter.injection.ActivityContext

@Module
class ActivityModule(private val mActivity: Activity) {

    @Provides
    internal fun provideActivity(): Activity {
        return mActivity
    }

    @Provides
    @ActivityContext
    internal fun providesContext(): Context {
        return mActivity
    }
}
