package com.asp.splitwiseclone.onboarding.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.asp.splitwiseclone.onboarding.ui.screens.InitialScreen

sealed class OnboardScreens(val route: String) {
    data object InitialScreen: OnboardScreens("initial")
}

@Composable
fun OnboardNavGraph(){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = OnboardScreens.InitialScreen.route
    ) {
        composable(route = OnboardScreens.InitialScreen.route) {
            InitialScreen()
        }
    }
}