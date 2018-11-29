package com.juanlucena.gokuapp.services

import com.juanlucena.gokuapp.models.Prueba
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface PruebaService {

    @GET("/getPruebas")
    fun getPruebas() : Call<List<Prueba>>

    @POST("/insertPrueba")
    fun addPrueba(@Body prueba : Prueba) : Call<Void>

    @GET("/deletePrueba")
    fun deletePrueba(prueba : Prueba) : Call<Void>

    @GET("/cleanPruebaTable")
    fun cleanPruebaTable() : Call<Void>
}