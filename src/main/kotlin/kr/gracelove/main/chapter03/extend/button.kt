package kr.gracelove.main.chapter03.extend

open class View {
    open fun click() = println("View clicked")
}

class Button: View() {
    override fun click() {
        println("Button clicked")
    }
}

fun View.showOff() = println("I am a view!")
fun Button.showOff() = println("I am a button!")