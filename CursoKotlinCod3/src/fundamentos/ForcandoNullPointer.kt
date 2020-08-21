package fundamentos

fun main() {
    var a: Int? = null
    println(a?.inc())

    println("momento do erro...")
    println(a!!.inc())
}