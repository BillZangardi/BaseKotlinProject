package me.billzangardi.kotlinstarter.features.main

import me.billzangardi.kotlinstarter.features.base.BasePresenter
import me.billzangardi.kotlinstarter.injection.ConfigPersistent
import javax.inject.Inject

/**
 * Created by zangardiw on 12/22/17.
 */
@ConfigPersistent
class MainPresenter @Inject
constructor() : BasePresenter<MainView>() {
    override fun attachView(mvpView: MainView) {
        super.attachView(mvpView)
    }
}