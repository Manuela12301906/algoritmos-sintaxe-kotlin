fun main() {
    print("Digite a temperatura em Celsius: ")
    val celsius = readLine()?.toDoubleOrNull()

    if (celsius != null) 
    {
        val fahrenheit = (9.0 / 5.0) * celsius + 32
        println("A temperatura de $celsius°C corresponde a $fahrenheit°F.")
    } 
    else 
    {
        println("Por favor, digite um valor válido para Celsius.")
    }
}