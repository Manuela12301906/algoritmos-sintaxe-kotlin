fun main() {
    print("Digite a temperatura em Fahrenheit: ")
    val fahrenheit = readLine()?.toDoubleOrNull()

    if (fahrenheit != null)
    {
        val celsius = 5 * ((fahrenheit - 32) / 9)
        println("A temperatura de $fahrenheit°F corresponde a $celsius°C.")
    } 
    else
    {
        println("Por favor, digite um valor válido para Fahrenheit.")
    }
}