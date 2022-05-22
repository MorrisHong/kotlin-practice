package kr.gracelove.main

class Person(
    val name: String,
    val isMarried: Boolean
) {
    val age: Int
        get() {
            return 11
        }

    fun nameAndAge() = "Hello ${name} ! you are so ${if (age > 30) "old" else "yong"}"
}

class T {
    val name: String
        get() {
            TODO()
        }
}

