package com.s4id.learningbasics.superheroapp

import okhttp3.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("/api/8560ae5149fb487dd0e90031031f4221/search/{name}")
    suspend fun getSuperheroes(@Path("name")superheroName:String):Response<>
}