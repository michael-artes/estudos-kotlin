package funcoes

fun main() {
    val list = listOf("Joao", "MAria", "Pedro")
    println(list.segundoOrNull())
}

fun <E> List<E>.segundoOrNull(): E? = if(size >= 2) get(1) else null