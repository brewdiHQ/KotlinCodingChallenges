package com.example.kotlincodingchallenges.woche3

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay

@Composable
 fun LaunchedEffekt() {
    var delayMessage by remember { mutableStateOf("") }
    var resetMessage by remember { mutableStateOf(false) }

    LaunchedEffect(resetMessage) {
        if (resetMessage) {
            delay(6000)
            delayMessage = "Lorem Ipsum"
            resetMessage = false
        }
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        Text(
            text = delayMessage,
            fontSize = 36.sp,
            color = Color(0xFFFFA500)
        )

        Button(
            onClick = {
                delayMessage = ""
                resetMessage = true
            },
            modifier = Modifier.align(Alignment.TopCenter)
        ) {
            Text(text = "Reset")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LaunchedEffektPreview() {
    LaunchedEffekt()
}