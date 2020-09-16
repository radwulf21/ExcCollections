package matheus.exercicio03

fun main() {
    val conjuntoDeInteiros = listOf<Int>(1,2,3,4,5)
    somaTotal(conjuntoDeInteiros)
}
fun somaTotal(conjuntoDeInteiros: List<Int>) {
    var sum = 0
    for(num in conjuntoDeInteiros) {
        sum = num + sum
    }
    println(sum)
}