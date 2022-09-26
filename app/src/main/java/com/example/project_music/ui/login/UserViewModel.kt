package com.example.project_music.ui.login

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.project_music.data.model.User
import com.example.project_music.data.repository.UserRepository
import kotlinx.coroutines.*

class UserViewModel(application: Application) : ViewModel() {
    private val userRepository: UserRepository =UserRepository()
    val user = MutableLiveData<User>()
    suspend fun getUserInfro() :LiveData<User> = userRepository.getUserInfor()
}