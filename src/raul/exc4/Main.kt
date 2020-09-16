package raul.exc4

fun main() {
    val guardaVolumes = GuardaVolumes()

    val peca1 = Peca("Adidas", "Slim")
    val peca2 = Peca("Nike", "Sport")
    val peca3 = Peca("Vans", "Casual")
    val peca4 = Peca("Oakley", "Discreto")

    val lista1 = mutableListOf(peca1, peca2)
    val lista2 = mutableListOf(peca3, peca4)

    guardaVolumes.guardarPecas(lista1, lista2)
    println(guardaVolumes.dicionario)

    guardaVolumes.mostrarPecas(0)
}