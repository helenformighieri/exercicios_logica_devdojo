/*
Escreva um programa que realize a conversão de graus Celsius (C)
para graus Fahrenheit (F). Utilize a fórmula abaixo:

F = (( 9 C) / 5) + 32
 */

package condicionais;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        float grausCelcius = 0;

        System.out.println("Digite um valor em graus Celsius para gerar a conversão para Fahrenheit: ");
        grausCelcius = read.nextFloat();

        float fahrenheit = ((grausCelcius * 9) / 5) + 32;

        System.out.println(fahrenheit);
    }
}
