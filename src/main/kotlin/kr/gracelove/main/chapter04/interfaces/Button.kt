package kr.gracelove.main.chapter04.interfaces

class Button : Clickable {
    override fun click() = println("I was clicked")
}