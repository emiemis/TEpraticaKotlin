data class Aluno (val nome : String, val pontuacao : Long)

fun main(args: Array<String>) {
    val aluno = Aluno("Andrew", 80)

    when {
        aluno.pontuacao <= 59 -> print("f")
        aluno.pontuacao <= 69 -> print("d")
        aluno.pontuacao <= 79 -> print("c")
        aluno.pontuacao <= 89 -> print("b")
        aluno.pontuacao <= 100 -> print("a")
    }
}