/*
Baseado nas fórmulas abaixo, desenvolva uma rotina que calcule o salário líquido de um funcionário.
Após o cálculo o programa deve apresentar o salário base e o salário líquido calculado.

SB = HT * VH
TD = (PD / 100) * SB
SL = SB  - TD

Onde:
SB =  Salário Base
HT = Horas Trabalhadas
VH = Valor Hora de trabalho
TD = Total de Descontos
PD = Percentual de Desconto
SL = Salário Líquido

 */

package condicionais;
import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        float horasTrab = 0;
        float valorHrsTrab = 38.7f;
        float percentDesc = 18.0f;

        System.out.println("Digite as suas horas trabalhadas para saber seu salario liquido: ");
        horasTrab = read.nextFloat();

        float salarioBase = horasTrab * valorHrsTrab;
        float totalDesc = (percentDesc / 100) * salarioBase;
        float salarioLiquido = salarioBase - totalDesc;

        System.out.println("Seu salario liquido fica: " + salarioLiquido + " ja com " + percentDesc + "% de desconto dos impostos.");
    }
}
