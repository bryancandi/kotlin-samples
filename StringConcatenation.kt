fun main() {
    val firstName = "John"
    val lastName = "Doe"
    val age = 30

    // 1. Using the + operator
    val fullName1 = firstName + " " + lastName
    println("Full name: $fullName1")

    // 2. Using string templates
    val fullName2 = "$firstName $lastName"
    println("Full name: $fullName2")

    // 3. String templates with expressions
    val introduction = "Name: $fullName2, Age: ${age + 0}"
    println(introduction)
    
    // 4. String.format
    val formattedString = String.format("Name: %s %s, Age: %d", firstName, lastName, age)
    println(formattedString)
}
