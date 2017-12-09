package cz.demo.struct

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a * b


fun main(args: Array<String>) {
    println(sum(3, 4))
    println(sum2(3, 4))
}