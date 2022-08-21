package com.mlopez.interviewapp.repositories

import com.mlopez.interviewapp.models.ResponseModel
import com.mlopez.interviewapp.models.User
import com.mlopez.interviewapp.services.RetrofitInstance
import retrofit2.Response
import retrofit2.Retrofit

class UserApiRepository {
    suspend fun getAllUsers(): Response<ResponseModel> {
        return RetrofitInstance.api.getAllUsers()
    }
}