package kr.gracelove.main

fun main() {
    println(blockBodyMax(1,2))
    println(expressionBodyMax(1,2))
}

fun blockBodyMax(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun expressionBodyMax(a: Int, b: Int) = if (a > b) a else b

