package org.kotlin_Coming_Try_it

fun main() {
    val a = readln().toInt()

    for (i in 1..a) {
        print("  ".repeat(a-i))
        for (e in 1..i) {
            print("$e ")
        }
        for (g in i-1 downTo 1) {
            print("$g ")
        }
        println()
    }
}
