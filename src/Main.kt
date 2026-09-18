fun main() {
    val baseSalary = 5000
    val bonusAmount = 1000
    var totalSalary = "$baseSalary + $bonusAmount"
    totalSalary = calculate(baseSalary, bonusAmount)

    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}

//our total salary works not correctly, cuz its String, so Kotlin does not calculate sum.
//correct way below.

fun calculate(baseSalary: Int, bonusAmount: Int): String {
    val totalSalary: Int = baseSalary + bonusAmount
    return totalSalary.toString()
}