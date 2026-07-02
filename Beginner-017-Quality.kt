package org.kotlin_Coming_Try_it

fun main() {
    val b= readln().toInt() // 1 ≤ n ≤ 10
    for (e in 1..b) {
        val x= readln().toInt() // 2 ≤ x ≤ 65535
        var isPrime= true
        if (x> 1) {
            for (i in 2..(x/2)) {
                if (x% i== 0) {
                    println("N")
                    isPrime= false
                    break
                }
            }
            if (isPrime) {
                println("Y")
            }
        }
    }
}
