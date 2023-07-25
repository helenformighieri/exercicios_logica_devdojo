/*
Sabendo que 1ft é igual a 0,3048m ou 30,48 cm,
desenvolva um programa que leia uma medida em pés
e calcule o equivalente em metros.
 */

package variaveis_operadores_tiposDeDados;

import java.util.Scanner;

public class ExercicioDezessete {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in); //definindo leitura de dados pelo usuario


        System.out.println("Digite a medida em pés que deseja converter em metros: ");//mostrando perguntando ao usuario
        int ft = read.nextInt();//lendo dados do usuario

        float metros = ft * 0.3048f;//variavel de calculo usando o dado que o usuario digitou e o que a questão ofereceu

        System.out.println( ft + " pés = " + metros + "m");//mostrando na tela o resultado do calculo
    }
}
