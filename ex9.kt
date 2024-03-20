data class Pessoa (val nome : String, val  idade : Int, val  cidade : String)

fun main(args: Array<String>) {
    val pessoa = Pessoa("Andrew", 18, "Farroupilha")

    println("${pessoa.nome} da cidade de ${pessoa.cidade} tem a idade ${pessoa.idade}")
}