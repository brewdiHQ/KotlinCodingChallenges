package com.example.kotlincodingchallenges.old

/*
Du arbeitest an einem Fahrzeugmanagement-System für eine Mietwagenfirma. Deine Aufgabe ist es, ein einfaches System zu entwickeln, das zwei Fahrzeugtypen verwaltet.

Basisklasse erstellen
Erstelle eine Klasse namens Vehicle, die folgende Eigenschaften enthält:

Marke (brand: String)
Modell (model: String)
Füge eine Methode getDetails() hinzu, die die Fahrzeugdetails als String zurückgibt.


 */

// Basisklasse erstellen

open class Vehicle(

    val brand: String,
    val model: String
) {

    open fun getDetails(): String {
        return "Brand: $brand\nModel: $model"

    }
}

// Abgeleitete Klasse

class Car(
    brand: String,
    model: String,
    val numSeats: Int
) : Vehicle(brand, model) {
    override fun getDetails(): String {
        return "Marke: $brand, Modell: $model, Sitze: $numSeats"
    }
}

class Nutzfahrzeug(
    brand: String,
    model: String,
    val numSeats: Int,
    val loadCapacity: Double
    ) : Vehicle(brand, model) {
    override fun getDetails(): String {
        return "Marke: $brand, Modell: $model, Sitze: $numSeats, Loadcapacity: $loadCapacity"
    }
}

fun main() {

    // Ausgabe Basisklasse

    var vehicle = Vehicle("Mazda", "323")
    println(vehicle.getDetails())

    // Ausgabe abgeleitete Klasse

    val car = Car("BMW", "X5", 5)
    println(car.getDetails())

    // Ausgabe Nutzfahrzeug

    val truck = Nutzfahrzeug("Mercedes Benz", "MB-Trac 1300 Turbo ", 1, 1000.0)
    println(truck.getDetails())

}