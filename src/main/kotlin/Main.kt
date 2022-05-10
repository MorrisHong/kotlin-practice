fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val list = listOf("1", "2")

    println("Call blockBody : " + blockBody(null))
    println("Call expressionBody : " + expressionBody("morris"))
}

fun blockBody(name: String?): String {
    return if (name == "morris") "홍은모" else "누구야"
}

fun expressionBody(name: String) = if (name == "morris") "홍은모" else "누구야"


fun test() = if(true) "" else 123

class temp {
    fun tempMethod() = expressionBody("morris")

}