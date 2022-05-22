package kr.gracelove.main.geometry.shape

import java.util.Random

class Rectangle(val height: Int,
                val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        }
    val isSquare2: Boolean
        get() = height == width
}

fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}

fun createRandomRectangle2() = Rectangle(1, 2)

fun createRandomRectangle3() = run {
    val random = Random()
    Rectangle(random.nextInt(), random.nextInt())
}

fun createRandomRectangle4(): () -> Rectangle = {
    val random = Random()
    Rectangle(random.nextInt(), random.nextInt())
}