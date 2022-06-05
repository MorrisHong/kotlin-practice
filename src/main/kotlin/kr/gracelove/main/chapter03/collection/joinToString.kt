package kr.gracelove.main.chapter03.collection

fun main() {
    val list = listOf(1, 2, 3)
//    println("origin : $list")
//    println("joinToString : ${joinToString(list, ";", "(", ")")}")
//    println(
//        "joinToString with parameter name : ${
//            joinToString(
//                collection = list,
//                separator = ";",
//                prefix = "(",
//                postfix = ")"
//            )
//        }"
//    )
//    println(
//        """
//        joinToString with default value :
//        ${
//            joinToString(
//                collection = list,
//                prefix = "#",
//            )
//        }
//        """
//    )
    println("morris".lastChar())

}

fun <T> joinToString(
    collection: Collection<T>,
    separator: String = ",",
    prefix: String = "",
    postfix: String = "",
): String {

    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

fun String.lastChar(): Char = this.get(this.length - 1)