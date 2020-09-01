package funcoes

fun main() {
    println("o menor valor é ${min(3, 2)}")
}

fun min(a: Int, b: Int): Int = if (a < b) a else b