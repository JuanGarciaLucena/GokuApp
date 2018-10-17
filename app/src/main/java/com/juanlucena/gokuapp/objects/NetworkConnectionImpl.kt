package com.juanlucena.gokuapp.objects

import com.juanlucena.gokuapp.BuildConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NetworkConnectionImpl : NetworkConnection {

    private val retrofit : Retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://api.jikan.moe/v3/anime/1/")
            .build()

    override val getRetrofit: Retrofit
        get() = retrofit
}