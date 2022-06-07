package kr.gracelove.main.chapter04.interfaces

class Button : Clickable {
    override fun click() = println("I was clicked")
}


internal fun main() {

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