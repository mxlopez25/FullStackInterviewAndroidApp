package com.mlopez.interviewapp.models

data class User(
    val id: Int,
    val firstName: String? = null,
    val lastName: String? = null,
    val email: String? = null,
    val username: String? = null,
    val password: String? = null
)