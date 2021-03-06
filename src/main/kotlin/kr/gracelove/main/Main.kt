package kr.gracelove.main

import kr.gracelove.main.chapter03.collection.lastChar

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val list = listOf("1", "2")
    val string = "asdsad"

    println("Call blockBody : " + blockBody(null))
    println("Call expressionBody : " + expressionBody("morris"))
    println("Call temp.tempMethod() : " + Temp().tempMethod())

    println("홍은모".lastChar())
    tttt(null)
}

fun tttt(name: String?) {
    println(name?.lastChar())
}

fun blockBody(name: String?): String {
    println(Temp().tempMethod())
    return if (name == "morris") "홍은모" else "누구야"
}

fun expressionBody(name: String) = if (name == "morris") "홍은모" else "누구야"


fun test() = if(true) "" else 123

class Temp {
    fun tempMethod() = "abc"

}