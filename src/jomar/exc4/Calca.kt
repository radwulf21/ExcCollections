package jomar.exc4

class Calca(marca: String, modelo: String) : Peca(marca, modelo) {
    override fun retirada() {
        println("Calça da marca ${this.marca} do modelo ${this.modelo} foi retirada.")
    }
}