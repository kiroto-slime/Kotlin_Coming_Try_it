package org.kotlin_Coming_Try_it

fun main() {
    val year= readln().toInt()
    val ans: String
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        ans= "a leap year"
    }
    else {ans= "a normal year"}
    println(ans)
}
