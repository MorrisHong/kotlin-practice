package kr.gracelove.main.lambda_practice

data class Person(
    val name: String,
    val age: Int,
)

fun findTheOldest(people: List<Person>) {
    var maxAge = 0
    var theOldest: Person? = null

    for (person in people) {
        if (person.age > maxAge) {
            maxAge = person.age
            theOldest = person
        }
    }

    println(message = "the oldest person : $theOldest")
}

fun main() {
    val people = listOf(
        Person("Alice", 29),
        Person("Bob", 31)
    )

    findTheOldest(people)
}