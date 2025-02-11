fun main() {

    print("Digite o primeiro número: ")
    val numero1 = readLine()?.toIntOrNull()

    print("Digite o segundo número: ")
    val numero2 = readLine()?.toIntOrNull()

    if (numero1 != null && numero2 != null) 
    {
        val soma = numero1 + numero2
        println("A soma dos dois números é: $soma")
    } 
    else 
    {
        println("Por favor, digite números válidos.")
    }
}