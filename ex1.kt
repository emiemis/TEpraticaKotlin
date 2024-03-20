fun ex1() = println("Olá, mundo!")

fun main(args: Array<String>) {
    var max = 99
    var cont = 0
    do {
        ex1()
        cont++
    } while (cont < max)
}