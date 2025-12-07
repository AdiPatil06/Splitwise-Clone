package com.asp.splitwiseclone.usecases.composables

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.statusBars
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp

@Composable
fun systemNavBarHeight() : Dp {
    return WindowInsets.navigationBars.asPaddingValues().calculateBottomPadding()
}

@Composable
fun systemStatusBarHeight() : Dp {
    return WindowInsets.statusBars.asPaddingValues().calculateTopPadding()
}