/*
Elaborar um programa que leia o salário base mensal (SB) de um funcionário
e o percentual de reajuste (PR) e calcule e apresente o novo valor de salário
do funcionário. A fórmula abaixo é uma sugestão de como esse cálculo pode ser feito:

	NS = SB + (SB * PR) / 100

	Onde:
		NS = Novo Salário
        SB = Salário Base
	    PR = Percentual de Reajuste
 */

package variaveis_operadores_tiposDeDados;
public class ExercicioTreze {
    public static void main(String[] args) {

        float salarioAtual = 1300;
        float percentualReajuste = 8.9f;

        float salarioNovo = salarioAtual + (salarioAtual * percentualReajuste) / 100;

        System.out.println("Salario com novo percentual: " + salarioNovo);

    }
}
