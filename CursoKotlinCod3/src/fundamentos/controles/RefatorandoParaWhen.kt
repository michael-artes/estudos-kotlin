package fundamentos.controles

fun main() {

    val nota = 3

    when(nota) {
        10,9 -> println("Fantastico")
        7,8 -> println("Parabéns")
        6,5,4 -> println("Tem como recuperar")
        in 0..3 -> println("Te vejo no próximo semestre")
        else -> println("nota invalida")
    }
}