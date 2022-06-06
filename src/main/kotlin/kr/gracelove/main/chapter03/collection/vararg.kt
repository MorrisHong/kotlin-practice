package kr.gracelove.main.chapter03.collection

fun main() {
    val abc = listOf("가", "나", "다")
//    val array = Array<String>(3,"a","b","c")
//    listOf("args: ", *abc)
    println(abc)
    a(abc)
}

fun a(list: List<String>) {
    println(list)
}