package funcoes

class Operacoes {
    fun somar(a: Int, b: Int): Int = a + b
}

fun somar(a: Int, b: Int): Int = a + b

fun calc(a: Int, b: Int, funcao: (Int, Int) -> Int): Int = funcao(a, b)


fun <E> filtrar(lista: List<E>, filtro: (E) -> Boolean): List<E> {
    val listaFiltrada = ArrayList<E>()

    for (e in lista) {
        if(filtro(e)) {
            listaFiltrada.add(e)
        }
    }

    return listaFiltrada
}

fun comTresLetras(nome: String): Boolean = nome.length == 3

fun main() {
    println(calc(2, 4, Operacoes()::somar)) //funcao da classe operacoes
    println(calc(2, 3, ::somar))

    val nomes = listOf("Ana", "Pedro", "Bia", "Guri", "Rebeca")
    println(filtrar(nomes, ::comTresLetras))
}
