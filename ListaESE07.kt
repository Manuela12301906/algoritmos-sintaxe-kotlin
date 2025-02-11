fun main() {
   
    print("Digite o lado do quadrado: ")
    val lado = readLine()?.toDoubleOrNull()

    
    if (lado != null && lado > 0) 
    {
        val area = lado * lado

        val dobroArea = 2 * area

        println("A área do quadrado é: $area")
        println("O dobro da área do quadrado é: $dobroArea")
    } 
    else 
    {
        println("Por favor, digite um valor válido para o lado.")
    }
}