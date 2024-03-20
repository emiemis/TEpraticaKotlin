fun main(args: Array<String>) {
    testaPrimo(18)
    testaPrimo(17)
}

fun testaPrimo(numero :Int){
    for (i in 2 until numero) {
        if (numero % i == 0) {
            println("o numero $numero não é primo")
            return
        }
    }

    println("o numero $numero é primo")
}