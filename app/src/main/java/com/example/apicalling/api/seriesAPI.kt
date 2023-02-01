package com.example.apicalling.api

import retrofit2.http.GET

interface seriesAPI {
    @GET("v1/series")
    suspend fun getSeriesInfo()
}