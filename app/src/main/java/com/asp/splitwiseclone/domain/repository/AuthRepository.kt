package com.asp.splitwiseclone.domain.repository

import dagger.Provides

interface AuthRepository {

    suspend fun login(email: String, password: String): Result<Unit>
    suspend fun register(email: String, password: String): Result<Unit>
    suspend fun logout()
    fun isLoggedIn(): Boolean
}