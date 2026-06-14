package org.kotlin_Coming_Try_it

fun main() {
    val z= readln().toInt()
    val ans: Any
    if (z>2) {
        ans= (z-2)*4+21
    }
    else if (z in 1..2) {
        ans= z * 10.5
    }
    else {ans= "Wrong"}
    println(ans)
}
