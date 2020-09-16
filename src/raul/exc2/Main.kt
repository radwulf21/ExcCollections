package raul.exc2

fun main() {
    val lista1 = mutableListOf<Int>()
    val lista2 = mutableSetOf<Int>()

    lista1.add(1)
    lista1.add(5)
    lista1.add(5)
    lista1.add(6)
    lista1.add(7)
    lista1.add(8)
    lista1.add(8)
    lista1.add(8)

    println(lista1)

    lista2.add(1)
    lista2.add(5)
    lista2.add(5)
    lista2.add(6)
    lista2.add(7)
    lista2.add(8)
    lista2.add(8)
    lista2.add(8)

    println(lista2)

    println("Não podemos ter números repetidos em um conjunto de valores")

    println("lista1 é igual a lista2? ${lista1 == lista2}")
}