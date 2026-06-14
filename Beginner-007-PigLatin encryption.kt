package org.kotlin_Coming_Try_it

fun main() {
    val y= readln()
    val ans=
        if (y[0] in listOf('a', 'e', 'i', 'o', 'u')) {
            "${y}way"
        } else {
            "${y.substring(1)}${y[0]}ay"
        }
    println(ans)
}
