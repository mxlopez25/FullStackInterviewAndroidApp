package com.mlopez.interviewapp.models

import java.util.*

data class ProductImage(
    val id: Int,
    val productId: Int,
    val fileName: String? = null,
    val filePath: String? = null,
    val createdDate: Date?
)