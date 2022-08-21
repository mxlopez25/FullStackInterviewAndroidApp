package com.mlopez.interviewapp.services

import com.mlopez.interviewapp.models.ResponseModel
import com.mlopez.interviewapp.models.User
import retrofit2.Response
import retrofit2.http.GET

interface UserApiService {
    @GET("user/all")
    suspend fun getAllUsers(): Response<ResponseModel> {
        return RetrofitInstance.api.getAllUsers()
    }
}