package kr.gracelove.main

fun main() {
//    val peoples = listOf(Person("Alice", 29), Person("Bob", 31))
//    peoples.stream().forEach { p -> println(p) }
//    println(peoples)

    val test = Meemememememe()
    val array = arrayOf("morris", "graceLove")
    test.templateString(array)

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

    fun templateString(args: Array<String>) {
        val name = if (args.size > 0) args[0] else "Kotlin"
        println("Hello $name")
        println("Hello ${args[0]}")

        println(
            "Hello ${
                if (args[0].equals("morris")) {
                    "updatedMorris"
                } else {
                    "updatedGraceLove"
                }
            }"
        )
    }
}