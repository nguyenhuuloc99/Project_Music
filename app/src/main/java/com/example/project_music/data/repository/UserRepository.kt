package com.example.project_music.data.repository

import com.example.project_music.data.network.ApiConfig
import com.example.project_music.data.network.RetrofitService

class UserRepository {
    suspend fun getUserInfor() = ApiConfig.api.getUserInfo()
}