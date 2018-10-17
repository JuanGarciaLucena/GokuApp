package com.juanlucena.gokuapp.services

import com.juanlucena.gokuapp.models.Episode
import retrofit2.Call
import retrofit2.http.GET

interface SearchService {

    @GET("episodes/2")
    fun getEpisodes() : Call<Episode>

}