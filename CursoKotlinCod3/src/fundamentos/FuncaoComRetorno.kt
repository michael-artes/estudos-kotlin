package fundamentos

fun soma(a: Int, b: Int = 1): Int {
    return a + b
}

fun main() {
    println(soma(3,5))
    println(soma(3))
}