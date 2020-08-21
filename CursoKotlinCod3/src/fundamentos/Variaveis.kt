package fundamentos

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    var a: Int
    var b = 2 //tipo inferido

    a = 10

    println(a + b)

    a = 5
    a += b

    println(a + b)
}