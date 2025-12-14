package com.asp.splitwiseclone.domain.usecase

import com.asp.splitwiseclone.domain.repository.AuthRepository
import javax.inject.Inject

class IsUserLoggedInUseCase @Inject constructor(
    private val repo: AuthRepository
) {
    operator fun invoke(): Boolean = repo.isLoggedIn()
}