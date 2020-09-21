package raul.exc3

fun main() {
    val pontos = mutableSetOf(1, 2, 3, 4)

    val prova = Prova(pontos)

    println("Soma dos Pontos: ${prova.somaTotal()}")

    println("Conjunto set: ${prova.pontos}")
}