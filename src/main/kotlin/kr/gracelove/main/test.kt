package kr.gracelove.main

fun main() {
//    val peoples = listOf(Person("Alice", 29), Person("Bob", 31))
//    peoples.stream().forEach { p -> println(p) }
//    println(peoples)

    val test = Meemememememe()
    val array = arrayOf("test", "morris")
    test.test(array)

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

    fun test(args: Array<String>) {
        val name = if (args.size > 0) args[0] else "Kotlin"
        println("Hello $name")
        println("Hello ${args[0]}")
    }


}