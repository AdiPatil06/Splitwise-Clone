package com.asp.splitwiseclone.data.repository

import com.asp.splitwiseclone.data.remote.firebase.auth.FirebaseAuthSource
import com.asp.splitwiseclone.domain.repository.AuthRepository
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(
    private val firebaseSource: FirebaseAuthSource
) : AuthRepository {

    override suspend fun login(email: String, password: String): Result<Unit> {
        return firebaseSource.login(email, password)
    }

    override suspend fun register(email: String, password: String): Result<Unit> {
        return firebaseSource.register(email, password)
    }

    override suspend fun logout() = firebaseSource.logout()

    override fun isLoggedIn(): Boolean = firebaseSource.isLoggedIn()
}