package com.example.kotlincodingchallenges.old

/*
Du arbeitest weiter an einem Online Shop für Lebensmittel und willst die Logik für einen Einkauf programmieren.
Der Supermarkt möchte ein neues Sortiment erstellen, mit neuen Preisen. Außerdem soll die Einkaufsliste des Kunden abgerechnet werden.

Sortiment Preisänderung

Erstelle eine neue veränderliche Map für den Supermarkt. Hier soll ein neues Sortiment gespeichert werden
Nutze eine Schleife, um durch das alte Sortiment durchzugehen. Für jeden Eintrag soll der Preis um 1€ erhöht werden und in der neuen Map gespeichert werden

Abrechnung der Einkaufsliste

Erstelle eine Zählvariable, die zu Beginn den Preis 0 beinhaltet
Gehe mit einer Schleife durch die Einkaufsliste des Kunden und schaue für jedes Produkt den aktuellen Preis im Sortiment nach. Rechne diesem Preis auf die
Zählvariable, um am Ende den gesamten Preis zu erhalten.
Nutze jetzt eine when Verzweigung:
Falls der Preis unter 10€ ist, gib "Toller Preis!" auf der Konsole aus
Falls der Preis zwischen 10€ und 50€ ist, gib "Normaler Preis" auf der Konsole aus
Falls der Preis über 100€ ist, gib "Teuer..." auf der Konsole aus
 */


fun main() {

    val einkaufsListe: MutableList<String> = mutableListOf()
    println(einkaufsListe)

    einkaufsListe.add("Äpfel 🍎")
    einkaufsListe.add("Zitronen 🍋")
    einkaufsListe.add("Bananen 🍌")
    einkaufsListe.add("Milch 🍼")
    println(einkaufsListe)

    // ganze Listen hinzufügen
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

    // Neues Sortiment

    var newAssortment = mutableMapOf(
        "Erdnüsse 🥜" to 2.99,
        "Salat" to 0.99,
        "Butter" to 2.49,
        "Zucker" to 1.99,
        "Sahne" to 1.49,
        "Spülmittel" to 3.99,
        "Handseife" to 0.69,
        "Auto Motor Sport" to 2.99,
        "Batterien" to 4.79
    )

    println("newAssortment Liste: $newAssortment")

    // newAssortment + 1

    for (item in newAssortment) {
        val key = item.key
        val value = item.value
        newAssortment[key] = value + 1
    }

    println("newAssortment Liste mit +1: $newAssortment")

    // Abrechnung der Einkaufsliste

    einkaufsListe.add("Erdnüsse 🥜")
    einkaufsListe.add("Salat")
    einkaufsListe.add("Butter")
    einkaufsListe.add("Zucker")
    einkaufsListe.add("Sahne")

    println("Neue Einkaufsliste: $einkaufsListe")




}