package com.example.kotlincodingchallenges.old

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

data class Movie(
    val name: String,
    val director: String,
    val ReleaseYear: String,
    val Rating: Double,
//    val Seen: Boolean
)

@Composable
fun MyLazyColumn(modifier: Modifier = Modifier) {

    val movies = listOf(
        Movie("The Godfather", "Francis Ford Coppola", "2000", Rating = 7.9),
        Movie("Citizen Kane", "Orson Welles","2001", Rating = 8.3),
        Movie("Pulp Fiction", "Quentin Tarantino","2002", Rating = 9.9),
        Movie("2001: A Space Odyssey", "Stanley Kubrick", "2003", Rating = 6.7),
        Movie("The Shawshank Redemption", "Frank Darabont", "2004", Rating = 5.8),
    )

    LazyColumn(modifier = modifier) {
        items(movies) { movie ->
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
                    .background(Color.Black)
            ) {
//                Row(
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(10.dp)
//                        .padding(horizontal = 100.dp)
//                        .background(Color.Yellow)
//                ) {
//                    Text(
//                        text = movie.name,
//                        modifier = Modifier.padding(bottom = 4.dp),
//                        color = Color.Red,
//                    )
//            }


                // Column sorgt dafür, dass die Textfelder untereinander angezeigt werden
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp) // Padding für alle Elemente
                ) {
                    // Name des Films
                    Text(
                        text = movie.name,
                        modifier = Modifier.padding(bottom = 4.dp), // Abstände zwischen den Texten
                        color = Color.Yellow,
                    )

                    // Regisseur
                    Text(
                        text = movie.director,
                        modifier = Modifier.padding(bottom = 4.dp),
                        color = Color.Green,
                    )

                    // Erscheinungsjahr
                    Text(
                        text = movie.ReleaseYear,
                        modifier = Modifier.padding(bottom = 4.dp),
                        color = Color.Red,
                    )

                    // Bewertung
                    Text(
                        text = "Rating: ${movie.Rating}",
                        modifier = Modifier.padding(bottom = 4.dp),
                        color = Color.Blue,
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MyLazyColumnPreview() {
    MyLazyColumn()
}