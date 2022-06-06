package kr.gracelove.main.chapter04

import kr.gracelove.main.chapter04.interfaces.Button
import kr.gracelove.main.chapter04.interfaces.Clickable

fun main() {
    val clickable: Clickable = Button()
    clickable.click()
}