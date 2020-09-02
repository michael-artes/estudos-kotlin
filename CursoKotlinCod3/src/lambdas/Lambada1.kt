package lambdas

fun main() {
    //funcao lambda sempre retorna a ultima linha
    var soma = { x: Int, y: Int -> x + y }
    println(soma(10, 20))
}