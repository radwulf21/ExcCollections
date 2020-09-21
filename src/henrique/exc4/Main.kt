package henrique.exc4

fun main() {
    val locker = GuardaVolumes()

    val telefone1 = Peca("Apple", "iPhone")
    val telefone2 = Peca("Motorola", "V5")
    val notebook1 = Peca("Asus", "A105")
    val notebook2 = Peca("Apple", "MacBook Air")

    println("Peças guardadas no volume #${locker.guardarPecas(telefone1, notebook1)}\n")
    println("Peças guardadas no volume #${locker.guardarPecas(telefone2, notebook2)}\n")

    locker.mostrarPecas()

    locker.procurarPeca(9)
    locker.procurarPeca(2)

    locker.devolverPeca(9)
    locker.devolverPeca(2)
    locker.mostrarPecas()

    println("Peças guardadas no volume #${locker.guardarPecas(telefone2, notebook2)}\n")
    locker.mostrarPecas()
}

