package com.example.kotlincodingchallenges.old

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * Beschreibung der Funktion
 *
 * @param profileName
 */
@Composable
fun SimpleProfile(profileName: String = "Mein Profil") {
    Surface {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Row {
                Text(
                    text = profileName,
                    fontStyle = FontStyle.Italic,
                    fontSize = 24.sp
                )
                Icon(
                    imageVector = Icons.Rounded.AccountCircle,
                    contentDescription = "Profilbild",
                )
            }
            Card(
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
            ) {
                Text(
                    text = "Das ist eine Profilbeschreibung.",
                    modifier = Modifier.padding(8.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SimpleProfilePreview() {
    SimpleProfile()
}

@Preview(showBackground = true)
@Composable
fun SimpleProfileWithArgPreview() {
    SimpleProfile(profileName = "Stephan Mustermann")
}

@Preview(showBackground = true)
@Composable
fun SimpleProfileWith2ndArgPreview() {
    SimpleProfile(profileName = "Ayranman")
}