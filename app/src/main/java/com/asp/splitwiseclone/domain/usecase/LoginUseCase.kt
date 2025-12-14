package com.asp.splitwiseclone.domain.usecase

import com.asp.splitwiseclone.domain.repository.AuthRepository

class LoginUseCase(private val repo: AuthRepository) {
    suspend operator fun invoke(email: String, password: String) =
        repo.login(email, password)
}