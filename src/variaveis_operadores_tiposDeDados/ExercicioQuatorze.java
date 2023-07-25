/*
Desenvolva uma rotina que leia dois valores numéricos inteiros e apresente
o resultado das quatro operações aritméticas básicas (adição, subtração, multiplicação e divisão).
 */

package variaveis_operadores_tiposDeDados;

import java.util.Scanner;

public class ExercicioQuatorze {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;

        System.out.println("Digite o primeiro número: ");
        num1 = read.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = read.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
    }
}
