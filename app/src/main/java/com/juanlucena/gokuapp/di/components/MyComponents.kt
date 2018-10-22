package com.juanlucena.gokuapp.di.components

import com.juanlucena.gokuapp.ui.search.activities.MainActivity
import com.juanlucena.gokuapp.di.modules.NetworkModule
import com.juanlucena.gokuapp.tasks.jobs.DelayJob
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(NetworkModule :: class))
interface MyComponents {

    fun inject(delayJob : DelayJob)

}