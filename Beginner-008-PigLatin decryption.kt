package org.kotlin_Coming_Try_it

fun main() {
    val y= readln()
    val ans= if (y.endsWith("way")) {
        y.substring(0, y.length- 3)
    } else {
        "${y[y.length- 3]}${y.substring(0, y.length- 3)}"
    }
    println(ans)
}
