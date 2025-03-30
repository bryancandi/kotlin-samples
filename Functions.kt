fun main() {
    println(birthdayGreeting(name = "Rover", age = 2))
    println(birthdayGreeting(age = 5, name = "Rex"))
    println(birthdayGreeting("Russ", 8))
    println(birthdayGreetingDefault(age = 2))
}

fun birthdayGreeting(name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting\n"
}

fun birthdayGreetingDefault(name: String = "Rover", age: Int): String {
    return "Happy Birthday, $name! You are now $age years old!"
}
