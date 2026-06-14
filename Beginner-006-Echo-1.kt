package org.kotlin_Coming_Try_it

fun main() {
    val test= readln()
    val rev= test.reversed()

    if (test!= rev) {
        println(rev+ test)
    } else {
        println(test)
    }
}
