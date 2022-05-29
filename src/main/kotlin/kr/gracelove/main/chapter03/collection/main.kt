package kr.gracelove.main.chapter03.collection

fun main() {
    map()
    println()
    list()
    println()
    set()
    println()
}

fun map() {
    val mapOf = mapOf(1 to "onee", 2 to "twoo")
    println("mapOf.javaClass : ${mapOf.javaClass}")
    println("mapOf : $mapOf")

    val hashMapOf = hashMapOf(1 to "onee", 2 to "twooo")
    println("hashMapOf.javaClass : ${hashMapOf.javaClass}")
    println("hashMapOf : $hashMapOf")
}

fun list() {
    val listOf = listOf(1, 3, 4)
    println("listOf.javaClass : ${listOf.javaClass}")
    println("listOf : $listOf")

    val arrayListOf = arrayListOf(53, 1, 9)
    println("arrayListOf.javaClass : ${arrayListOf.javaClass}")
    println("arrayListOf : $arrayListOf")
    arrayListOf.add(22)
}

fun set() {
    val setOf = setOf("a", "b", "c")
    println("setOf.javaClass : ${setOf.javaClass}")
    println("setOf : $setOf")

    val oneSetOf = setOf(1)
    println("oneSetOf.javaClass : ${oneSetOf.javaClass}")
    println("oneSetOf : $oneSetOf")

    val hashSetOf = hashSetOf(1, 7, 53)
    println("hashsetOf.javaClass : ${hashSetOf.javaClass}")
    println("hashsetOf : $hashSetOf")
}