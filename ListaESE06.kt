fun main() {
    print("Digite o raio do círculo: ")
    val raio = readLine()?.toDoubleOrNull()


    if (raio != null && raio > 0) 
    {
        val area = Math.PI * raio * raio
        println("A área do círculo com raio $raio é: $area")
    } 
    else 
    {
        println("Por favor, digite um valor válido para o raio.")
    }
}
