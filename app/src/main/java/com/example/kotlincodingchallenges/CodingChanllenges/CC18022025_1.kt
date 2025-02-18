package com.example.kotlincodingchallenges.CodingChanllenges

/*
Einkaufsliste
Lege eine Einkaufsliste an, sie soll veränderlich sein und Strings speichern
Ein Kunde möchte "Äpfel", "Bananen" und "Milch" kaufen. Füge diese drei Produkte zur Einkaufsliste hinzu
Der Kunde ist organisiert. Sortiere die Liste alphabetisch, damit er leicht überprüfen kann, ob er nichts vergessen hat
Sortiment
Lege eine Map an, in der Produkte enthalten sind (Schlüssel), die jeweils einen Preis haben (Wert)
Achte darauf, dass alle Produkte, die der Kunde in seiner Einkaufsliste hat, auch im Sortiment vorkommen
Der Kunde hat vergessen, wie viel er für die Bananen bezahlen muss. Finde es heraus, indem du den Preis aus dem Sortiment ausliest

 */

fun main() {

    val einkaufsListe: MutableList<String> = mutableListOf()
    println(einkaufsListe)

    einkaufsListe.add("Äpfel 🍎")
    einkaufsListe.add("Zitronen 🍋")
    einkaufsListe.add("Bananen 🍌")
    einkaufsListe.add("Milch 🍼")
    println(einkaufsListe)

//    einkaufsListe.addAll(listOf("Äpfel 🍎", "Zitronen 🍋", "Bananen 🍌", "Milch 🍼"))

    einkaufsListe.sort()
    println(einkaufsListe)

    val sortiment: Map<String, Double> = mapOf(
        "Äpfel 🍎" to 0.99,
        "Zitronen 🍋" to 0.79,
        "Bananen 🍌" to 0.59,
        "Milch 🍼" to 1.29
    )

    val alleProdukteVorhanden = einkaufsListe.all { produkt -> sortiment.containsKey(produkt) }

    if (alleProdukteVorhanden) {
        println("Alle Produkte vorhanden")
    } else {
        println("Nicht alle Produkte vorhanden")
    }

    val bananenPreis = sortiment["Bananen 🍌"]
    if (bananenPreis != null) {
        println("Der Preis für Bananen beträgt: $bananenPreis")
    } else {
        println("Bananen sind nicht im Sortiment vorhanden")
    }
}