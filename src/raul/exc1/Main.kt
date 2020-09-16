package raul.exc1

fun main() {
    val dicionario = Dicionario()

    dicionario.loteriaSonhos.forEach {
        println("${it.key}: ${it.value}")
    }

    dicionario.amigos.forEach {
        println("${it.key}: ${it.value}")
    }
}