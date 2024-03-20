fun main(args: Array<String>) {
    println("Digite um numero: ")
    val x: Int? = readLine()?.toInt()

    if (x!! % 2 == 0) {
        println("O numero é par")
    } else {
        println("O numero é impar")
    }
}