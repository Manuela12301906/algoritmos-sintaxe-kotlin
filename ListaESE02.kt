fun main() {
    print("Digite um número: ")
    val numero = readLine()?.toIntOrNull()

    if (numero != null) 
    {
        println("O número informado foi $numero.")
    } 
    else 
    {
        println("Por favor, digite um número válido.")
    }
}