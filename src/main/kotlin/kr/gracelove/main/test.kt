package kr.gracelove.main

fun main() {
    val peoples = listOf(Person("Alice", 29), Person("Bob", 31))
    peoples.stream().forEach { p -> println(p) }
    println(peoples)
}

data class Person constructor(val name: String, val age: Int) {

}