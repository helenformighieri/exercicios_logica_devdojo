/*
Escreva um programa que realize a conversão de graus Fahrenheit (F)
para graus Celsius (C). Utilize a fórmula abaixo:

C = (( F - 32)  5) / 9
 */

package condicionais;
import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        float fahrenheit = 0;

        System.out.println("Digite um valor de graus Fahrenheit para converter para graus Celcius: ");
        fahrenheit = read.nextFloat();

        float celcius = ((fahrenheit - 32) * 5) / 9;

        System.out.println(celcius);
    }
}
