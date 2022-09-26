package com.example.project_music.base

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider

abstract class BaseActivity<DB : ViewDataBinding, VM : BaseViewModel>(
    private val layoutId: Int,
    private val viewModelClass: Class<VM>
) : AppCompatActivity() {
    val binding by lazy {
        DataBindingUtil.setContentView(this,layoutId) as DB
    }
    val viewModel by lazy {
        ViewModelProvider(this).get(viewModelClass)
    }
    abstract fun onInitDataBinding()
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        binding.lifecycleOwner = this
        onInitDataBinding()
    }
}