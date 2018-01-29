package me.billzangardi.kotlinstarter.injection.component

import dagger.Subcomponent
import me.billzangardi.kotlinstarter.features.base.BaseActivity
import me.billzangardi.kotlinstarter.features.main.MainActivity
import me.billzangardi.kotlinstarter.injection.PerActivity
import me.billzangardi.kotlinstarter.injection.module.ActivityModule

@PerActivity
@Subcomponent(modules = arrayOf(ActivityModule::class))
interface ActivityComponent {

    fun inject(baseActivity: BaseActivity)
    fun inject(mainActivity: MainActivity)

}
