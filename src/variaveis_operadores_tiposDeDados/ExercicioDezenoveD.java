/*
Ainda podemos realizar o cálculo de potência elétrica, desenvolva um rotina que
calculo a potência de um equipamento, utilizando os dados e a fórmula a seguir:
Dados: 220 V e 25 A

Fórmula:
P = U * I

Onde:
P = Potência em Watts
U = Tensão em Volts
I = Corrente em Amperes

BÔNUS:Altere o programa acima e permita que o usuário digite os valores
para Volts e Amperes.
 */

package variaveis_operadores_tiposDeDados;
import java.util.Scanner;

public class ExercicioDezenoveD {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        /*
        int u = 220;
        int i = 25;
        int p = u * i;

        System.out.println(p);
         */

        //Bonus implementado
        int u = 0;
        int i = 0;

        System.out.println("Digite a voltagem: ");
        u = read.nextInt();

        System.out.println("Digite os Ampéres: ");
        i = read.nextInt();

        int p = u * i;

        System.out.println("Potencia em Watts: " + p);

    }
}
