package kr.gracelove.main.lambda_practice

import java.awt.Button

interface Parser {
    fun parse(text: String)
}

class Test{
    fun print(text: String, parser: Parser) {

    }
}

fun main() {
//    val test = Test()
//    test.print("hihi", Parser())
    val button = Button()
    button.addActionListener {  }
}

//class ParserImpl : Parser {
//    override fun parse(text: String) {
//        TODO("Not yet implemented")
//    }
//}

//class HtmlParser: Parser {
//    fun print(text: String) {
//        this.parse(text)
//    }
//
//    override fun parse(text: String) {
//        print("this is html parser : $text")
//    }
//}

//fun main() {
//    val htmlParser = HtmlParser()
//
////    htmlParser.print {"asdd" -> }
//}