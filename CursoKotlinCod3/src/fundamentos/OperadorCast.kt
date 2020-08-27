package fundamentos

fun main() {
    val notas = arrayOf(9.6, 3.8, 7.2, 5.5, 4.1)

    for (nota in notas){

    }
}

fun imprimirConceito(nota: Any) {
    when(nota as? Int) {
        10,9 -> println("A")
        8,7 -> println("A")
        6,5 -> println("B")
        4,3 -> println("C")
        2,1,0 -> println("D")
        else -> println("D")
    }
}