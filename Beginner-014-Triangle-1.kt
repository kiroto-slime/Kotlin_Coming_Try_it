package org.kotlin_Coming_Try_it

fun main() {
    val a= readln().toInt()

    for (i in 1..a) {
        for (e in 1..i) {
            print("$e ")
        }
        println()
    }
    println()
    for (i in a downTo 1) {
        for (e in 1..i) {
            print("$e ")
        }
        println()
    }
    println()
    for (i in a downTo 1) {
        for (e in a downTo a-i+1) {
            print("$e ")
        }
        println()
    }
    println()
    for (i in 1..a) {
        print("  ".repeat( a-i ))
        for (e in 1..i) {
            print("$e ")
        }
        println()
    }
}
