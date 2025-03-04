package com.example.kotlincodingchallenges.woche3

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun WaterCounter(
modifier: Modifier = Modifier
) {
    var waterCount by remember { mutableStateOf(220) }

    Column(modifier = modifier) {
        Text(text = "Wasser sippen: $waterCount")

        Button(
            onClick = { waterCount++ },
            modifier = Modifier,
        ) {
            Text(text = "Wasser sippen")
        }

        Button(
            onClick = { waterCount-- },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
            modifier = Modifier,
        ) {
            Text(text = "huch, einer zu viel")
        }

    }

}

@Preview(showBackground = true)
@Composable
private fun WaterCounterPreview() {
    // Use Theme here
    WaterCounter()
}