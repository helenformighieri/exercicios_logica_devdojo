/*
Em um circuito elétrico temos as seguintes informações:
275 V e 10 A, calcule a resistência elétrica, utilizando a fórmula abaixo:

R = U / I

Onde:
	R = Resistência em Ohms
	U = Tensão em Volts
	I = Corrente em Amperes

BÔNUS: Altere o programa acima e permita que o
usuário digite os valores para Volts e Amperes.

 */

package variaveis_operadores_tiposDeDados;

import java.util.Scanner;

public class ExercicioDezenoveA {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

     /*
     int tensao = 275;
     int correnteAmperes = 10;
     int resistencia = tensao / correnteAmperes;

        System.out.println(resistencia);
      */

        //Bonus implementado

        int tensao = 0;
        int correnteAmperes = 10;

        System.out.println("Digite a Voltagem: ");
        tensao = read.nextInt();

        System.out.println("Digite a Corrente em Ampéres: ");
        correnteAmperes = read.nextInt();

        int resistencia = tensao / correnteAmperes;

        System.out.println("Resistência em Ohms: " + resistencia);
    }
}
