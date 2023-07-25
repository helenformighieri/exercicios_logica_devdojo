/*
Em um circuito elétrico temos as seguintes informações:
12 V e 175 Ω, calcule a corrente elétrica, utilizando a fórmula abaixo:

I= U / R

Onde:
	I = Corrente em Amperes
	U = Tensão em Volts
	R = Resistência em Ohms

BÔNUS: Altere o programa acima e permita que o usuário digite os valores
	   para Volts e Ohms.
 */

package variaveis_operadores_tiposDeDados;
import java.util.Scanner;

public class ExercicioDezenoveC {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        /*
        float u = 12;
        float r = 175;

        float i = u / r;

        System.out.println(i);
         */

        //Bonus aplicado

        float u = 0;
        float r = 0;

        System.out.println("Digite a voltagem: ");
        u = read.nextFloat();

        System.out.println("Digite Ohms: ");
        r = read.nextFloat();

        float i = u / r;

        System.out.println(i);
    }
}
