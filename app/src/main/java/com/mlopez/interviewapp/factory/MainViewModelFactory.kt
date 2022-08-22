package com.mlopez.interviewapp.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import com.mlopez.interviewapp.MainViewModel
import com.mlopez.interviewapp.repositories.UserApiRepository

class MainViewModelFactory(private val repository: UserApiRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
        return MainViewModel(repository) as T
    }
}