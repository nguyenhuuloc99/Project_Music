package com.example.project_music.data.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiConfig {
    private const val Base_URl= "";
    val retrofit = Retrofit.Builder()
        .baseUrl(Base_URl)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val api :RetrofitService = retrofit.create(RetrofitService::class.java)

}