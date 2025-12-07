package com.asp.splitwiseclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.asp.splitwiseclone.onboarding.ui.navigation.OnboardNavGraph
import com.asp.splitwiseclone.tabs.groups.ui.screens.GroupsMainScreen
import com.asp.splitwiseclone.ui.theme.SplitwiseCloneTheme

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