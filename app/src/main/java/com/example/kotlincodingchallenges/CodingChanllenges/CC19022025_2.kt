package com.example.kotlincodingchallenges.CodingChanllenges

/*
Du arbeitest weiter im Smart Garden System. Du willst eine Funktion schreiben, die ein Smart Garden System aktiviert oder deaktiviert.

(De-)Aktivierungsfunktion
Das Ziel ist es, eine Funktion zu schreiben, die ein Gerät gesagt bekommt und was sie mit dem Gerät tun soll.

Gerätename übergeben: Die Funktion soll den Namen des Geräts (z. B. "Bewässerungssystem", "Luftbefeuchter") als Parameter akzeptieren.
Aktion als Lambda definieren: Die Funktion soll eine Aktion als Lambda akzeptieren, das beschreibt, was mit dem Gerät passieren soll.
Aktionen umsetzen: Nutze die Funktion, um verschiedene Aktionen mit unterschiedlichen Geräten auszuführen.
Beispiel:
Rufe die Funktion für ein Bewässerungssystem auf und lasse die Ausgabe Das Bewässerungssystem wird gestartet ausdrucken.
Rufe die Funktion für einen Luftbefeuchter auf und lasse die Ausgabe Das Luftbefeuchter wird eingeschaltet ausdrucken.

 */

fun main() {
    // Funktion aufrufen
    controlDevice("Bewässerungssystem") { println("Das $it wird gestartet.") }
    controlDevice("Luftbefeuchter") { println("Das $it wird eingeschaltet.") }
}

// Funktion mit Lambda
fun controlDevice(device: String, action: (String) -> Unit) {
    action(device)
}