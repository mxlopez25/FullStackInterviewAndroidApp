package com.mlopez.interviewapp.services

import com.mlopez.interviewapp.utils.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(Constants.WEBSERVICE_API_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api: UserApiService by lazy {
        retrofit.create(UserApiService::class.java)
    }
}