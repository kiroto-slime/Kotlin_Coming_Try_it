package org.kotlin_Coming_Try_it

fun main() {
    val y= readln()
    var ans= "False"

    for (i in y) {
        if (i in "aeiou") {
            ans= "True"
        }
    }
    println(ans)
}
