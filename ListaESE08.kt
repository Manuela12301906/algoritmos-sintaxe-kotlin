fun main() {
    print("Digite quanto você ganha por hora: R$ ")
    val valorPorHora = readLine()?.toDoubleOrNull()

    print("Digite o número de horas trabalhadas no mês: ")
    val horasTrabalhadas = readLine()?.toDoubleOrNull()

    if (valorPorHora != null && horasTrabalhadas != null && valorPorHora > 0 && horasTrabalhadas > 0)
    {

        val salarioMensal = valorPorHora * horasTrabalhadas
        println("O seu salário no mês será: R$ $salarioMensal")
    } 
    else
    {
        println("Por favor, digite valores válidos para o salário por hora e horas trabalhadas.")
    }
}
