package me.billzangardi.kotlinstarter.injection.component

import dagger.Subcomponent
import me.billzangardi.kotlinstarter.injection.PerFragment
import me.billzangardi.kotlinstarter.injection.module.FragmentModule

/**
 * This component inject dependencies to all Fragments across the application
 */
@PerFragment
@Subcomponent(modules = arrayOf(FragmentModule::class))
interface FragmentComponent