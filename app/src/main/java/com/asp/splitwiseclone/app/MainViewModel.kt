package com.asp.splitwiseclone.app

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.asp.splitwiseclone.domain.usecase.IsUserLoggedInUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val isUserLoggedInUseCase: IsUserLoggedInUseCase
) : ViewModel() {

    private val tag = "MainViewModel"

    var startDestination by mutableStateOf<String?>(null)
        private set

    init {
        determineStartDestination()
    }

    private fun determineStartDestination() {
        val loggedIn = isUserLoggedInUseCase()
        startDestination = if (loggedIn) {
            "main_graph"
        } else {
            "onboarding_graph"
        }
    }
}