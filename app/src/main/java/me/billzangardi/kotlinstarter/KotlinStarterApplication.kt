package me.billzangardi.kotlinstarter

import android.content.Context
import android.support.multidex.MultiDexApplication
import com.facebook.stetho.Stetho
import com.orhanobut.hawk.Hawk
import com.squareup.leakcanary.LeakCanary
import me.billzangardi.kotlinstarter.injection.component.ApplicationComponent
import me.billzangardi.kotlinstarter.injection.component.DaggerApplicationComponent
import me.billzangardi.kotlinstarter.injection.module.ApplicationModule
import timber.log.Timber

/**
 * Created by zangardiw on 12/22/17.
 */
class KotlinStarterApplication : MultiDexApplication() {

    private var mApplicationComponent: ApplicationComponent? = null

    @Suppress("DEPRECATION")
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
            Stetho.initializeWithDefaults(this)
            LeakCanary.install(this)
        }
        Hawk.init(this).build()
    }

    // Needed to replace the component with a test specific one
    var component: ApplicationComponent
        get() {
            if (mApplicationComponent == null) {
                mApplicationComponent = DaggerApplicationComponent.builder()
                        .applicationModule(ApplicationModule(this))
                        .build()
            }
            return mApplicationComponent as ApplicationComponent
        }
        set(applicationComponent) {
            mApplicationComponent = applicationComponent
        }

    companion object {
        operator fun get(context: Context): KotlinStarterApplication {
            return context.applicationContext as KotlinStarterApplication
        }
    }
}