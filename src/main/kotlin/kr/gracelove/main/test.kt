package kr.gracelove.main

fun main() {
    val peoples = listOf(Person("Alice", 29), Person("Bob", 31))
    peoples.stream().forEach { p -> println(p) }
    println(peoples)
}

data class Person constructor(val name: String, val age: Int) {

}

class Meemememememe {
    fun me(
        name: String,
        c: Int,
        d: Int,
        callback: (a: Int, b: Int) -> Int
    ): String {
        return name + callback(c, d)
    }

    fun asdsad() {
        me("morris", 1, 2) { a, b ->
            val aa = 123
            return@me if(aa == 123) 12 else 5

            val bb = 444

            a + b
        }
    }

    fun method() : Any {
        return if(true) "asd" else 123;
    }

    fun method1() = if(true) "asde" else 123

    
}