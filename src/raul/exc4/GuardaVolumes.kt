package raul.exc4

class GuardaVolumes {
    val dicionario = mutableMapOf<Int, MutableMap<Int, Pertence>>()
    private var contador: Int = 0

    fun guardarPecas(listaPertences: MutableMap<Int, Pertence>): Int {
        this.dicionario[this.contador] = listaPertences
        this.contador++
        return this.contador - 1
    }

    fun mostrarPecas() {
        this.dicionario.forEach { dicionario ->
            print("Número de identificação: ${dicionario.key} -> ")
            dicionario.value.forEach { pertence ->
                print("{${pertence.value.marca}, ${pertence.value.modelo}} ")
            }
            println()
        }
    }

    fun mostrarPecas(index: Int) {
        print("Número de identificação: $index -> ")
        this.dicionario[index]?.values?.forEach { pertence ->
            print("[${pertence.marca}, ${pertence.modelo}] ")
        }
    }

    fun devolverPecas(index: Int) {
        this.dicionario.remove(index)
        println("Pertences de número de idenficação igual a '$index' devolvidos!")
    }
}