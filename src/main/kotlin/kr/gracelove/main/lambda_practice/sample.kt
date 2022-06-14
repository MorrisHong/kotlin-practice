package kr.gracelove.main.lambda_practice

import java.util.stream.Collector
import kotlin.streams.toList

enum class Color {
    GREEN,
    RED,
    BLUE,
    YELLOW
}

class Apple(
    val price: Int,
    val color: Color,
    val weight: Int,
) {

}

fun main() {
    var number: Int = 0

    val apples = listOf(
        Apple(1_000, Color.RED, 10),
        Apple(2_000, Color.BLUE, 10),
        Apple(3_000, Color.GREEN, 20),
        Apple(4_000, Color.YELLOW, 10),
    )

    apples.forEach {
        number++
    }

    /**
     * 마지막 파라미터가 함수일 경우, 소괄호 밖에 람다를 사용할 수 있음.
     */
    filterGreenApples(apples)
    filterApples(apples, { it.color == Color.GREEN })
    filterApples(apples) { it.color == Color.GREEN }
    filterApples(apples, { apple -> apple.color == Color.GREEN })
    filterApples(apples) { apple -> apple.color == Color.GREEN }
    filterApples(apples) { apple: Apple -> apple.color == Color.GREEN }

    filterApples(apples) { apple: Apple -> apple.color == Color.GREEN && apple.price > 1000 }


    val isGreen = fun(apple: Apple): Boolean {
        return apple.color == Color.GREEN
    }

    filterApples(apples, isGreen)
    filterApples(apples) { isGreen }
}

fun filterGreenApples(apples: List<Apple>): List<Apple> {
    val result = mutableListOf<Apple>()
    for (apple in apples) {
        if (Color.GREEN == apple.color) {
            result.add(apple)
        }
    }
    return result
}

fun filterApples(
    apples: List<Apple>,
    filter: (Apple) -> Boolean,
): List<Apple> {
    val result = mutableListOf<Apple>()
    for (apple in apples) {
//        if (filter(apple)) {
//            result.add(apple)
//        }

        if (filter.invoke(apple)) {
            result.add(apple)
        }
    }

    return result
}

fun filterApples2(
    apples: List<Apple>,
    filter: (Apple) -> Boolean,
): List<Apple> {
    return apples.stream()
        .filter(filter)
        .toList()
}

////////////////
