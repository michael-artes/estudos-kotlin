package operadores

fun main() {
    val execTrabalho = true
    val execTrabalho1 = true


    val comprouSorvete: Boolean = execTrabalho || execTrabalho1
    val comprouTv50: Boolean = execTrabalho && execTrabalho1

    //pelo que eu entendi a ideia do xor e fazer a negacao de uma expressao
    val comprouTv32: Boolean = execTrabalho xor execTrabalho1

    println(comprouSorvete)
    println(comprouTv50)
    println(comprouTv32)
}