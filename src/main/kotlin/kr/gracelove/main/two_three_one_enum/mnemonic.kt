package kr.gracelove.main.two_three_one_enum

fun a(c: Array<String>) {
    for (s in c) {
        println(s)
    }
}

fun main() {
        test {
            getMnemonicExpression(Color.RED)
        }
}

fun getMnemonicBody(color: Color) {
    when (color) {
        Color.RED -> "R"
        Color.ORANGE -> "O"
        Color.YELLOW -> "Y"
        Color.GREEN -> "G"
        Color.BLUE -> "B"
        Color.INDIGO -> "I"
        Color.VIOLET -> "V"
    }
}

fun getMnemonicExpression(color: Color) = {
    when (color) {
        Color.RED -> "R"
        Color.ORANGE -> "O"
        Color.YELLOW -> "Y"
        Color.GREEN -> "G"
        Color.BLUE -> "B"
        Color.INDIGO -> "I"
        Color.VIOLET -> "V"
    }
}
fun test(f: () -> () -> String) {
    println(f.invoke().invoke())
}

fun getMnemonicExpression2(color: Color) = run {
    when (color) {
        Color.RED -> "R"
        Color.ORANGE -> "O"
        Color.YELLOW -> "Y"
        Color.GREEN -> "G"
        Color.BLUE -> "B"
        Color.INDIGO -> "I"
        Color.VIOLET -> "V"
    }
}

fun getMnemonicExpression3(color: Color) = when (color) {
    Color.RED -> "R"
    Color.ORANGE -> "O"
    Color.YELLOW -> "Y"
    Color.GREEN -> "G"
    Color.BLUE -> "B"
    Color.INDIGO -> "I"
    Color.VIOLET -> "V"
}
