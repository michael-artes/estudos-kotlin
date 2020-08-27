package fundamentos

fun main(args: Array<String>) {
    val a = 1

    println(a.toString() + 1)

    //tudo no kotlin é tratado como objeto
    //string para número
    println("1.9".toDouble() + 1)
    println("Teste".toIntOrNull())
    println("Teste".toIntOrNull())
    println("1".toInt())
}