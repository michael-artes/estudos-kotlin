package funcoes


fun main() {
    for (n in ordenar(35,6,78,2,12)) {
        println("$n")
    }
}

fun ordenar(vararg numeros: Int): IntArray {
    return numeros.sortedArray()
}