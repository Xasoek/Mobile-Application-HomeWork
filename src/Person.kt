class Person(
    val name: String,
    val age: Int,
    val hobby: String?,
    val referrer: Person?
) {
    fun showProfile() {
        println("Name: $name")
        println("Age: $age")
        if (hobby != null) {
            print("Likes to $hobby. ")
        }
        if (referrer == null) {
            println("Doesn't have a referrer.")
        } else {
            println(
                "Has a referrer named ${referrer.name}, " +
                        "who likes to ${referrer.hobby}."
            )
        }
    }
}