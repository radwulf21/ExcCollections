package raul.exc4

fun main() {
    val guardaVolumes = GuardaVolumes()

    val pertence1 = Pertence("Adidas", "Slim"    )
    val pertence2 = Pertence("Nike"  , "Sport"   )
    val pertence3 = Pertence("Vans"  , "Casual"  )
    val pertence4 = Pertence("Oakley", "Discreto")

    val listaPertences1= mutableMapOf(0 to pertence1, 1 to pertence2)
    val listaPertences2= mutableMapOf(0 to pertence3, 1 to pertence4)

    guardaVolumes.guardarPecas(listaPertences1)
    guardaVolumes.guardarPecas(listaPertences2)
    guardaVolumes.devolverPecas(0)
    guardaVolumes.mostrarPecas()
}