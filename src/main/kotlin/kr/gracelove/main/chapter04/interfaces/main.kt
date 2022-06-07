package kr.gracelove.main.chapter04

import kr.gracelove.main.chapter04.interfaces.Button
import kr.gracelove.main.chapter04.interfaces.Clickable
import java.util.LinkedList

fun main() {
    val listOf = listOf(1, 2, 3, 4)
    println(listOf.javaClass)

    val of = setOf(1, 2, 3, 4)
    println(of.javaClass)

    val mapOf = mapOf(1 to 1, 2 to 2)
    println(mapOf.javaClass)
}