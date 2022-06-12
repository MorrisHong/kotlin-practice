package kr.gracelove.main.lambda_practice

fun main() {
    val people = listOf(
        Person("Alice", 29),
        Person("Bob", 31)
    )

    println(people.maxByOrNull { it.age })
    println(people.maxByOrNull(Person::age))
}