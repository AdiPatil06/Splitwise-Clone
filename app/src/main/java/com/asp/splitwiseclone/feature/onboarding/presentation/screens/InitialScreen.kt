package com.asp.splitwiseclone.feature.onboarding.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.asp.splitwiseclone.R
import com.asp.splitwiseclone.core.components.systemNavBarHeight

@Composable
fun InitialScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.primary)
            .padding(start = 20.dp, end = 20.dp, bottom = systemNavBarHeight()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier.weight(0.6f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(R.drawable.img_app_logo),
                contentDescription = null,
                modifier = Modifier.size(150.dp)
            )

            Text(
                text = "Splitwise",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp
            )
        }

        Column(
            modifier = Modifier.weight(0.3f),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp)
                    .padding(horizontal = 20.dp)
                    .clip(RoundedCornerShape(5.dp))
                    .background(MaterialTheme.colorScheme.secondary),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Sign Up",
                    color = Color.White,
                    fontWeight = FontWeight.Medium,
                    fontSize = 20.sp
                )
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp)
                    .padding(horizontal = 20.dp)
                    .clip(RoundedCornerShape(5.dp))
                    .border(width = (0.5).dp, color = Color.Gray, shape = RoundedCornerShape(5.dp))
                    .background(MaterialTheme.colorScheme.primary),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Log In",
                    color = Color.White,
                    fontSize = 18.sp
                )
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp)
                    .padding(horizontal = 20.dp)
                    .clip(RoundedCornerShape(5.dp))
                    .border(width = (0.5).dp, color = Color.Gray, shape = RoundedCornerShape(5.dp))
                    .background(MaterialTheme.colorScheme.primary),
                contentAlignment = Alignment.Center
            ) {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(R.drawable.icon_google),
                        contentDescription = null,
                        modifier = Modifier.size(25.dp)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = "Sign in with Google",
                        color = Color.White,
                        fontSize = 18.sp
                    )
                }
            }
        }

        val text = buildAnnotatedString {
            append(
                AnnotatedString(
                    "Terms",
                    spanStyle = SpanStyle(
                        color = Color.White,
                        textDecoration = TextDecoration.Underline
                    )
                )
            )
            append((AnnotatedString(" | ", spanStyle = SpanStyle(color = Color.White))))
            append(
                AnnotatedString(
                    "Privacy Policy",
                    spanStyle = SpanStyle(
                        color = Color.White,
                        textDecoration = TextDecoration.Underline
                    )
                )
            )
            append((AnnotatedString(" | ", spanStyle = SpanStyle(color = Color.White))))
            append(
                AnnotatedString(
                    "Contact us",
                    spanStyle = SpanStyle(
                        color = Color.White,
                        textDecoration = TextDecoration.Underline
                    )
                )
            )
        }

        Row(modifier = Modifier.weight(0.1f), verticalAlignment = Alignment.CenterVertically) {
            Text(
                text
            )
        }
    }
}