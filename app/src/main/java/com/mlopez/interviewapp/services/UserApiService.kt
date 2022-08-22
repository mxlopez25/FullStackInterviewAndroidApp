package com.mlopez.interviewapp.services

import com.mlopez.interviewapp.models.ResponseModel
import com.mlopez.interviewapp.models.User
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface UserApiService {
    @GET("all/")
    suspend fun getAllUsers(): Call<ResponseModel> {
        return RetrofitInstance.api.getAllUsers()
    }
}