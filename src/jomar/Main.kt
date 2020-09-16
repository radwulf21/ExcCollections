package jomar

import jomar.exc1.Exercicio1
import jomar.exc2.Exercicio2
import jomar.exc3.Exercicio3

fun main() {
    val exercicio1 = Exercicio1()
    exercicio1.imprimirMapas()

    println("\n".padStart(50, '-') + "\n")

    val exercicio2 = Exercicio2()
    exercicio2.imprimirLista()

    println("\n".padStart(50, '-') + "\n")
    val exercicio3 = Exercicio3()
    exercicio3.imprimirSomaEConjunto()
}