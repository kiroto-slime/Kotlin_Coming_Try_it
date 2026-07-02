package org.kotlin_Coming_Try_it

fun main() {
    val j= readln().toInt()
    for (i in 1..j) {
        val num= readln()
        var sum= 0
        for (c in num) {
            sum+= c.toString().toInt()
        }
        println(sum)
    }
}
