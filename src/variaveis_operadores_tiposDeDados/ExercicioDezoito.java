/*
Desenvolva uma rotina que dado um número inteiro qualquer
calcule seu antecessor e seu sucessor.
 */
package variaveis_operadores_tiposDeDados;
import java.util.Scanner;

public class ExercicioDezoito {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int num = 0;

        System.out.println("Digite um número inteiro para saber seu sucessor e seu antecessor: ");
        num = read.nextInt();

        int antecessor = num - 1;
        int sucessor =  num + 1;

        System.out.println("Antecessor: " + antecessor + "\nSucessor: " + sucessor);
    }
}
