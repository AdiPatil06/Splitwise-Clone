package com.asp.splitwiseclone.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.asp.splitwiseclone.feature.groups.presentation.screens.GroupsMainScreen
import com.asp.splitwiseclone.core.theme.SplitwiseCloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SplitwiseCloneTheme {
                GroupsMainScreen(true)
            }
        }
    }
}