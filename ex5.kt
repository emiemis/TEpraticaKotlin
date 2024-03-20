fun main(args: Array<String>) {
    println("Digite um numero: ")
    val x: Int? = readLine()?.toInt()

    for (i in 1..x!!){
        println(i)
    }
}