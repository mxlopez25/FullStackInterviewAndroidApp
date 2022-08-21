package com.mlopez.interviewapp.models

data class Address(
    val id: Int,
    val name: String? = null,
    val street1: String,
    val street2: String? = null,
    val city: String? = null,
    val country: String? = null,
    val zipCode: String? = null,
)