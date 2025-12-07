package com.asp.splitwiseclone.feature.groups.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.asp.splitwiseclone.R
import com.asp.splitwiseclone.core.components.NavBar
import com.asp.splitwiseclone.core.components.systemStatusBarHeight

@Composable
fun GroupsMainScreen(isInitialScreen: Boolean) {
    Scaffold(
        bottomBar = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(1.dp)
                        .background(Color.DarkGray)
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp)
                ) {
                    NavBar()
                }
            }
        },
        topBar = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = systemStatusBarHeight() + 10.dp, end = 10.dp),
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    imageVector = Icons.Default.Search,
                    contentDescription = null,
                    modifier = Modifier.size(30.dp),
                    colorFilter = ColorFilter.tint(color = Color.White)
                )

                Spacer(Modifier.width(20.dp))

                Image(
                    painter = painterResource(R.drawable.icon_add_group),
                    contentDescription = null,
                    modifier = Modifier.size(25.dp),
                    colorFilter = ColorFilter.tint(color = Color.White)
                )
            }
        },
        floatingActionButton = {
            if(!isInitialScreen) {
                Box(
                    modifier = Modifier
                        .clip(CircleShape)
                        .background(MaterialTheme.colorScheme.secondary)
                        .clickable {

                        }
                ) {
                    Row(
                        modifier = Modifier.padding(10.dp),
                        horizontalArrangement = Arrangement.spacedBy(10.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(R.drawable.icon_add_expense),
                            contentDescription = null,
                            modifier = Modifier.size(25.dp),
                            colorFilter = ColorFilter.tint(color = Color.White)
                        )
                        Text("Add Expense")
                    }
                }
            }
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.primary)
                .padding(
                    start = 20.dp,
                    end = 20.dp,
                    top = innerPadding.calculateTopPadding() + 20.dp,
                    bottom = innerPadding.calculateBottomPadding()
                ),
        ) {
            Text(
                text = "Welcome to Splitwise, Aditya!",
                style = MaterialTheme.typography.headlineSmall
            )

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 30.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(R.drawable.img_group_main),
                    contentDescription = null,
                    modifier = Modifier.size(200.dp)
                )

                Text(
                    text = "Splitwise groups you create or are added to will show here",
                    style = MaterialTheme.typography.headlineSmall,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 10.dp, horizontal = 20.dp),
                    textAlign = TextAlign.Center
                )

                Spacer(Modifier.height(10.dp))

                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(5.dp))
                        .border(
                            width = 1.dp,
                            color = MaterialTheme.colorScheme.tertiary,
                            shape = RoundedCornerShape(5.dp)
                        )
                ) {
                    Row(
                        modifier = Modifier.padding(10.dp),
                        horizontalArrangement = Arrangement.spacedBy(10.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(R.drawable.icon_add_group),
                            contentDescription = null,
                            modifier = Modifier.size(25.dp),
                            colorFilter = ColorFilter.tint(color = MaterialTheme.colorScheme.tertiary)
                        )
                        Text(
                            text = "Start a new group",
                            style = MaterialTheme.typography.titleMedium,
                            color = MaterialTheme.colorScheme.tertiary
                        )
                    }
                }
            }
        }
    }
}