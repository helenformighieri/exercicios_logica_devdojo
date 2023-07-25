/*
Em um circuito elétrico temos as seguintes informações:
275 Ω e 1 A, calcule a tensão elétrica, utilizando a fórmula abaixo:

U = R * I

Onde:
	U = Tensão em Volts
	R = Resistência em Ohms
	I = Corrente em Amperes

BÔNUS: Altere o programa acima e permita que o usuário digite os valores
	para Ohms e Amperes.
 */

package variaveis_operadores_tiposDeDados;

import java.util.Scanner;

public class ExercicioDezenoveB {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        /*
        int r = 275;
        int i = 1;
        int u = r * i;
        System.out.println(u);
        */

        //parte bonus
        int r = 0;
        int i = 0;

        System.out.println("Digite a resistencia elétrica: ");
        r = read.nextInt();

        System.out.println("Digite a corrente em Ampére: ");
        i = read.nextInt();

        int u = r * i;

        System.out.println("Voltagem: " + u);

    }
}
