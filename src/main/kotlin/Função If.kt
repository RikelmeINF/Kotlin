fun main(){
    val Questao = "Qual a senha ? "
    val RespostaCerta = " Rikelme Silva Souza"

    println("$Questao")
    val Reposta = readln()

    if (Reposta == RespostaCerta) // "Se" a "resposta" for "igual" a "respostacerta"
        println("Acertou") // aparecera está mensagem
    else(println("tente novamente!")) // "se não" esta
}