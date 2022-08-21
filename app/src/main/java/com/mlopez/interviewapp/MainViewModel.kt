package com.mlopez.interviewapp

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mlopez.interviewapp.models.ResponseModel
import com.mlopez.interviewapp.models.User
import com.mlopez.interviewapp.repositories.UserApiRepository
import kotlinx.coroutines.launch

class MainViewModel(private val repository: UserApiRepository): ViewModel() {
    private var _response = MutableLiveData(ResponseModel())
    val response: LiveData<ResponseModel> = _response

    fun saveUser(value: ResponseModel) {
        _response.value = value
    }

    fun fetchUsers() {
        viewModelScope.launch {
            val response = repository.getAllUsers()
            Log.d("MainViewModel_fetchUser", response.toString())
            _response.value = response.body()
        }
    }
}