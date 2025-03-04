package com.example.kotlincodingchallenges.old

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kotlincodingchallenges.R

@Composable
fun SayHelloToCC() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),

        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Hallo")

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Links",
                modifier = Modifier
//                    .background(Color.Red)
                    .padding(8.dp)
            )
            Text(
                text = "Rechts",
                modifier = Modifier
                    .background(Color.Yellow)
                    .padding(8.dp)
            )
            Text(
                text = "Mitte",
                modifier = Modifier
                    .background(Color.Green)
                    .padding(8.dp)
            )

        }

        Text(
            text = "Tschüß"
        )

        Icon(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Star Icon",
            modifier = Modifier.size(124.dp),

        )
    }
}

// todo Test

@Preview(showBackground = true)
@Composable
fun SayHelloToCCPreview() {
    SayHelloToCC()
}