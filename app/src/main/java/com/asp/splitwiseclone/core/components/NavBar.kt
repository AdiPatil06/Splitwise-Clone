package com.asp.splitwiseclone.core.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.asp.splitwiseclone.R

data class NavItems(
    val title: String,
    val icon: Int
)

@Composable
fun NavBar() {
    var selected by remember {
        mutableStateOf("Groups")
    }

    val navItems = listOf(
        NavItems(
            title = "Groups",
            icon = R.drawable.icon_groups
        ),
        NavItems(
            title = "Friends",
            icon = R.drawable.icon_friends
        ),
        NavItems(
            title = "Activity",
            icon = R.drawable.icon_activity
        ),
        NavItems(
            title = "Account",
            icon = R.drawable.icon_account
        ),
    )

    NavigationBar(
        containerColor = Color.Transparent
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            navItems.forEach {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.clickable(
                        interactionSource = remember { MutableInteractionSource() },
                        indication = null
                    ) {
                        selected = it.title
                    }
                ) {
                    Image(
                        painter = painterResource(it.icon),
                        contentDescription = null,
                        modifier = Modifier.size(20.dp),
                        colorFilter = ColorFilter.tint(color = if (selected == it.title) MaterialTheme.colorScheme.secondary else Color.White)
                    )
                    Text(
                        text = it.title,
                        color = if (selected == it.title) MaterialTheme.colorScheme.secondary else Color.White,
                        style = MaterialTheme.typography.titleSmall,
                        fontWeight = if (selected == it.title) FontWeight.Bold else FontWeight.Normal
                    )
                }
            }

//            navItems.forEach {
//                NavigationBarItem(
//                    selected = selected == it.title,
//                    onClick = {
//                        selected = it.title
//                    },
//                    icon = {
//                        Image(
//                            painter = painterResource(it.icon),
//                            contentDescription = null,
//                            modifier = Modifier.size(20.dp)
//                        )
//                    },
//                    label = {
//                        Text(
//                            text = it.title,
//                            color = Color.White
//                        )
//                    }
//                )
//            }
        }
    }
}