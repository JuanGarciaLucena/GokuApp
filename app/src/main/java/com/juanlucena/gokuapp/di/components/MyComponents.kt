package com.juanlucena.gokuapp.di.components

import com.juanlucena.gokuapp.ui.search.activities.MainActivity
import com.juanlucena.gokuapp.di.modules.NetworkModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(NetworkModule :: class))
interface MyComponents {

    fun inject(mainActivity: MainActivity)

}