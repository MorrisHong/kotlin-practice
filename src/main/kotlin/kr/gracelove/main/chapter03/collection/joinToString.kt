package kr.gracelove.main.chapter03.collection

fun main() {
    val list = listOf(1,2,3)
    println("origin : $list")
    println("joinToString : ${joinToString(list,";","(",")")}")
}

fun <T> joinToString(
    collection: Collection<T>,
    separator: String,
    prefix: String,
    postfix: String,
): String {

    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}