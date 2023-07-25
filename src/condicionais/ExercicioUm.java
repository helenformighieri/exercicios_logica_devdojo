/*
Baseado na fórmula abaixo escreva um programa que calcule e apresente a área de um círculo.

A = R2

Onde:
 	A representa a área do círculo
  	PI = 3.141592654
	R = Raio do círculo (deve ser fornecido pelo usuário)
 */

package condicionais;
import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite o raio do circulo: ");
        float raioDoCirculo = read.nextFloat();

        float a = (float) (Math.PI * Math.pow(raioDoCirculo, 2));

        System.out.println(a);

    }
}

