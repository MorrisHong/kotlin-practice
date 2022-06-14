package kr.gracelove.main.lambda_practice

fun alphabet() : String {
    return with(StringBuilder()) {
        for (letter in 'A'..'Z') {
            this.append(letter)
        }
        append("\n")
        this.toString()
    }
}

fun main() {

}