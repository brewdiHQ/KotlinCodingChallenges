package com.example.kotlincodingchallenges.CodingChanllenges

/*
Du arbeitest an einem Smart-Garden-System. In dieser Challenge wirst du Funktionen mit Rückgabewerten erstellen und verwenden.

1. Luftfeuchtigkeit prüfen
Erstelle eine Funktion, die die Luftfeuchtigkeit (zwischen 0 und 100) als Parameter entgegennimmt und true zurückgibt, wenn die Luftfeuchtigkeit ideal ist, andernfalls false. Rufe die Funktion auf und gib das Ergebnis auf der Konsole aus.

Eine Luftfeuchtigkeit von 60% ist ideal.

Erwartete Ausgabe:

Ist die Luftfeuchtigkeit ideal? true


2. Temperatur prüfen
Erstelle eine Funktion, die die aktuelle Temperatur als Parameter entgegennimmt und eine Nachricht als String zurückgibt, ob die Temperatur ideal für das Wachstum der Pflanzen ist. Rufe die Funktion einmal auf und gib das Ergebnis auf der Konsole aus.

Wenn die Temperatur über 18°C und unter 25°C ist, ist die Temperatur ideal.

Erwartete Ausgabe:

Die Temperatur von 20 Grad ist ideal für das Pflanzenwachstum.

 */


fun main() {
    // Aufgabe 1: Luftfeuchtigkeit prüfen
    val humidity = 60
    val isIdealHumidity = checkHumidity(humidity)
    println("Ist die Luftfeuchtigkeit ideal? $isIdealHumidity")

    // Aufgabe 2: Temperatur prüfen
    val temperature = 20
    val temperatureMessage = checkTemperature(temperature)
    println(temperatureMessage)
}

// Funktion für Aufgabe 1
fun checkHumidity(humidity: Int): Boolean {
    return humidity == 60
}

// Funktion für Aufgabe 2
fun checkTemperature(temperature: Int): String {
    return if (temperature in 19..24) {
        "Die Temperatur von $temperature Grad ist ideal für das Pflanzenwachstum."
    } else {
        "Die Temperatur von $temperature Grad ist nicht ideal für das Pflanzenwachstum."
    }
}