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
    var waterCount by remember { mutableStateOf(0) }

    Column(modifier = modifier) {
        CounterTextComposable(waterCount)
        CounterButtonComposable(onClick = { waterCount++ })

        Button(
            onClick = { waterCount-- },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Red),
            modifier = Modifier,
        ) {
            Text(text = "Huch, einer zu viel")
        }

        Text(text = "Gesamt: ${"%.2f".format(waterCount * 0.2)} Liter")
    }
}

@Composable
fun CounterTextComposable(counterValue: Int) {
    Text(text = "Wasser sippen: $counterValue x")
}

@Composable
fun CounterButtonComposable(onClick: () -> Unit) {
    Button(
        onClick = onClick,
        modifier = Modifier,
    ) {
        Text(text = "Wasser sippen")
    }
}

@Preview(showBackground = true)
@Composable
private fun WaterCounterPreview() {
    // Theme verwenden
    WaterCounter()
}