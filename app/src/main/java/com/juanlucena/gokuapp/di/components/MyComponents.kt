package com.juanlucena.gokuapp.di.components

import com.juanlucena.gokuapp.di.modules.NetworkModule
import com.juanlucena.gokuapp.tasks.jobs.*
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(NetworkModule :: class))
interface MyComponents {

    fun inject(delayJob : DelayJob)
    fun inject(getPruebaListJob: GetPruebaListJob)
    fun inject(addPruebaJob: AddPruebaJob)
    fun inject(deletePruebaJob: DeletePruebaJob)
    fun inject(cleanPruebaTableJob: CleanPruebaTableJob)
}