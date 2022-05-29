package kr.gracelove.main.two_three_one_enum

fun main() {
    println(mix(Color.YELLOW, Color.RED))
}

fun getWarmth(color: Color) = when (color) {
    Color.RED, Color.YELLOW, Color.ORANGE -> "warm"
    Color.BLUE -> "cold"
    else -> "?"
}

fun mix(c1: Color, c2: Color) =
    when (setOf(c1, c2)) {
        setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
        else -> throw Exception("Dirty color")
    }