package kr.gracelove.main.two_three_one_enum

fun main(args: Array<String>) {
    println(getMnemonicBody(Color.GREEN))
    println(getMnemonicExpression(Color.GREEN))
    println(getMnemonicExpression2(Color.GREEN))
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