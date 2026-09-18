fun main() {
//    println("City: Ankara")
//    println("Low temperature: 27, High temperature: 31")
//    println("Chance of rain: 82%")
    println(information("Ankara", 27, 31, 82))


//    println("City: Tokyo")
//    println("Low temperature: 32, High temperature: 36")
//    println("Chance of rain: 10%")
    println(information("Tokyo", 32, 36, 10))

//    println("City: Cape Town")
//    println("Low temperature: 59, High temperature: 64")
//    println("Chance of rain: 2%")
    println(information("Cape Town", 59, 64, 2))

//    println("City: Guatemala City")
//    println("Low temperature: 50, High temperature: 55")
//    println("Chance of rain: 7%")
    println(information("Guatemala City", 50, 55, 7))
}
fun information(city: String, lowTemp: Int, highTemp: Int, chanceOfRain: Int): String {
    return "City: $city\nLow temperature: $lowTemp, High temperature: $highTemp\nChance of rain: $chanceOfRain\n"
}