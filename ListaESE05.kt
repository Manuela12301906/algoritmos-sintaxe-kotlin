fun main() {
    print("Digite a quantidade de metros: ")
    val metros = readLine()?.toDoubleOrNull()

    if (metros != null) 
    {
        val centimetros = metros * 100
        println("$metros metros equivalem a $centimetros centímetros.")
    } 
    else 
    {
        println("Por favor, digite um valor válido para metros.")
    }
}