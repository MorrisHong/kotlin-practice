package kr.gracelove.main.lambda_practice

fun main() {
    val people = listOf(
        Person("Alice", 29),
        Person("Bob", 31)
    )

    people.maxByOrNull({ person -> person.age })
    people.maxByOrNull { person -> person.age }
    people.maxByOrNull { it.age }
    people.maxByOrNull(Person::age)
//    people.maxByOrNull({Person::age}
}