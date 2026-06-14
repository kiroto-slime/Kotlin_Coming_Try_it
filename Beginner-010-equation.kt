package org.kotlin_Coming_Try_it
import kotlin.math.sqrt // 開根號

fun main() {
    val (a, b, c)= readln().split(" ").map(String::toDouble)

    val D= b * b - 4 * a * c

    val ans= when {
        D> 0-> {
            val x1= (-b+ sqrt(D)) / (2 * a)
            val x2= (-b- sqrt(D)) / (2 * a)

            val small= minOf(x1, x2)
            val big= maxOf(x1, x2)
            "$small, $big"
        }
        D== 0.0-> {
            val x= -b / (2 * a)
            "DR=$x"
        }
        else -> "NoSolution"
    }
    println(ans)
}
