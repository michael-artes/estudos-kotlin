package funcoes


fun main() {
    imprimeMaior1(2,4)
    imprimeMaior2(2,4)
    imprimeMaior3(2,4)
    imprimeMaior4(2,4)
    imprimeMaior5(2,4).run { (2 > 4) }.run { println("Resultado = $this") }
}

fun imprimeMaior1(a: Int, b: Int) {
    println(Math.max(a, b))
}

fun imprimeMaior2(a: Int, b: Int): Unit {
    println(Math.max(a, b))
}
fun imprimeMaior3(a: Int, b: Int): Unit {
    println(Math.max(a, b))
    return
}

fun imprimeMaior4(a: Int, b: Int): Unit {
    println(Math.max(a, b))
    return Unit
}

fun imprimeMaior5(a: Int, b: Int) {
    println(Math.max(a, b))
    return Unit
}


