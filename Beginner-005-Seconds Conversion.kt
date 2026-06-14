package org.kotlin_Coming_Try_it

fun main() {
    val s= readln().toInt()
    val d= s / (24 * 60 * 60)
    var r= s % (24 * 60 * 60)
    val h= r / (60 * 60)
    r%= (60 * 60)
    val m= r / 60
    val sec= r % 60

    println("${d}D${h}H${m}M${sec}S")
}
