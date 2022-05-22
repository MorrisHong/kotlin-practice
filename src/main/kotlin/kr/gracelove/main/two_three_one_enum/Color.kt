package kr.gracelove.main.two_three_one_enum

enum class Color(
    val r: Int,
    val g: Int,
    val b: Int,
) {
    RED(255, 0, 0) {
        override fun displayName() {
            println("RED : this method is override. super = ${super.displayName()}")
        }
    },
    ORANGE(255, 165, 0),
    YELLOW(1,2,0),
    GREEN(3,4,2),
    BLUE(5,2,1),
    INDIGO(77,213,1),
    VIOLET(213, 55,2);

    fun rgb() = (r * 255 + g) * 256 + b
    open fun displayName(){
        println("This color is ${this.name}")
    }
}