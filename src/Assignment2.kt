fun main() {
    printFinalTemperature(
        27.0,
        "Celsius",
        "Fahrenheit", {celsius ->
            9.0 / 5.0 * celsius + 32
        })

    printFinalTemperature(
        320.0,
        "Celsius",
        "Fahrenheit",
        { kelvin ->
            kelvin - 273.15
        }
    )

    printFinalTemperature(
        30.0,
        "Fahrenheit",
        "Kelvin",
        { fahrenheit ->
            5.0 / 9.0 * (fahrenheit - 32) + 273.15
        }
    )
}


fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}