package org.kotlin_Coming_Try_it
import kotlin.math.pow // 次方

fun main() {
    val x= readln().toFloat()
    val pi= 3.14
    if (x<0) {
        println("Wrong")
    }
    else {
        println("${x.pow(2) * pi} ${2 * pi * x}")
    }
}
