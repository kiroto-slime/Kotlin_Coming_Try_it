package org.kotlin_Coming_Try_it

fun clean(x: Double): String {
    return if (x%1.0== 0.0) {
        x.toInt().toString()
    } else {
        x.toString()
    }
}

fun main() {
    val l= readln().toInt()

    repeat(l) {
        val n= readln().toInt()
        var j= 2
        var pi= 3.0
        var plus= true

        repeat(n-1) {
            val k= 4.0 / (j * (j+1) * (j+2))
            if (plus) {
                pi+= k
            } else {
                pi-= k
            }
            j+= 2
            plus= !plus
        }
        println(clean(pi))
    }
}
