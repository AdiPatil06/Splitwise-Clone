package com.asp.splitwiseclone.domain.usecase

import com.asp.splitwiseclone.domain.repository.AuthRepository

class RegisterUseCase(private val repo: AuthRepository) {
    suspend operator fun invoke(email: String, password: String) =
        repo.register(email, password)
}