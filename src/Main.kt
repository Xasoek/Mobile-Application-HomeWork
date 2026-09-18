fun main() {
    var timeSpentToday = 300

    var timeSpentYesterday = 250

    println(compare(timeSpentToday, timeSpentYesterday))

    timeSpentToday = 200


    println(compare(timeSpentToday, timeSpentYesterday))
}
fun compare(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday
}