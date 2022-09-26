package com.example.project_music.data.network

import androidx.lifecycle.LiveData
import com.example.project_music.data.model.User
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface RetrofitService {
    @GET("")
    suspend fun getUserInfo(): LiveData<User>

}
