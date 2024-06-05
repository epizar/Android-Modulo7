package com.example.alkeapi.data.response

data class UserDataResponse(
    val id: Int,
    val email: String,
    val first_name: String,
    val last_name: String,
    val password: String,
    val points: Int,
    val roleId: Int
)