package henrique.exc3

fun main() {
    val conjunto = setOf(1, 1, 2, 4, 8, 16)
    val prova = Prova(conjunto)

    println (prova.somaTotal())
}