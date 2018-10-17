package com.juanlucena.gokuapp.di.modules

import com.juanlucena.gokuapp.objects.NetworkConnection
import com.juanlucena.gokuapp.objects.NetworkConnectionImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class NetworkModule {

    @Provides
    @Singleton
    fun provideRetrofit() : NetworkConnection {
        return NetworkConnectionImpl()
    }


}