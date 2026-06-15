package org.kotlin_Coming_Try_it

fun main() {
    val (a,b)= readln().split(" ").map(String::toInt)
    if (b > a) {
        println(b-a)
    } else {
        println(b-a+200)
    }
}
