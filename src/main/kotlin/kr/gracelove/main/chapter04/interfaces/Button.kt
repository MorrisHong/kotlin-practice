package kr.gracelove.main.chapter04.interfaces

class Button : Clickable {
    override fun click() = println("I was clicked")
}


internal fun main() {
    val of = setOf("1", "2", "3")
    print(of.javaClass)
}

open class A {
    open fun method() = println("A")
}

interface B {
    fun method() = println("B")
}

class AB: A(), B {
    override fun method() {

    }
}