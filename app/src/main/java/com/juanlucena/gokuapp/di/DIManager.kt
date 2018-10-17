package com.juanlucena.gokuapp.di

import com.juanlucena.gokuapp.di.components.DaggerMyComponents
import com.juanlucena.gokuapp.di.components.MyComponents
import com.juanlucena.gokuapp.di.modules.NetworkModule

class DIManager {
    companion object {
        var myComponents: MyComponents? = null

        fun getComponent (): MyComponents {
            if (myComponents == null) {
                myComponents = DaggerMyComponents.builder().networkModule(NetworkModule()).build()
            }
            return myComponents!!
        }
    }
}