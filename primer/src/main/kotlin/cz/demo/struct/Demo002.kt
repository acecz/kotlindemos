package cz.demo.struct

fun tsVararg() {
    println(sumVars(3, 4, 5, 6))
}

fun sumVars(vararg v: Int): Int {
    var t = 0
    for (vt in v) {
        t = t.plus(vt)
    }
    return t
}

fun tsVal() {
    val a = 1
    println(sumVars(a))
    //Val cannot be reassigned
    //a = 2
}

fun tsLambda() {
    val sumLambda: (Int, Int) -> Int = { x, y -> x + y }
    println(sumLambda(5, 2))
}

fun tsStrFmt() {
    var a = 1
    val s1 = "a is $a"
    a = 2
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2)
}

fun main(args: Array<String>) {
    //tsVararg()
    //tsLambda()
    tsStrFmt()
}