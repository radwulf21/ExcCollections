package jomar

import jomar.exc1.Exercicio1
import jomar.exc2.Exercicio2
import jomar.exc3.Exercicio3
import jomar.exc4.Blusa
import jomar.exc4.Calca
import jomar.exc4.GuardaVolumes

fun main() {
    val exercicio1 = Exercicio1()
    exercicio1.imprimirMapas()

    println("\n".padEnd(50, '-') + "\n")

    val exercicio2 = Exercicio2()
    exercicio2.imprimirLista()

    println("\n".padEnd(50, '-') + "\n")
    val exercicio3 = Exercicio3()
    exercicio3.imprimirSomaEConjunto()

    println("\n".padEnd(50, '-') + "\n")
    println("Fazendo o pedido de blusas")
    val blusas = arrayListOf(
        Blusa("Calvin Klein", "é só 300R$!"),
        Blusa("Calvin Klein", "é só 300R$!"),
        Blusa("Chinesa", "tanto faz, é super barato!")
    )

    println("Fazendo o pedido de calças")
    val calcas = arrayListOf(
        Calca("Olaian", "neopreme"),
        Calca("Olaian", "neopreme"),
        Calca("Chinesa", "tanto faz, é super barato!")
    )

    println("Guardando os pedidos")
    val guardaVolumes = GuardaVolumes()
    val blusasIden = guardaVolumes.guardarPecas(blusas)
    val calcasIden = guardaVolumes.guardarPecas(calcas)


    println("Retirando pedidos de blusas")
    guardaVolumes.devolverPecas(blusasIden)
    println("Retirando pedidos de calças")
    guardaVolumes.devolverPecas(calcasIden)
}