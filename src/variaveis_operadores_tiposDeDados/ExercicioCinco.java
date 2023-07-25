/*
Escreva uma rotina capaz de calcular e apresentar o valor do volume de uma lata de óleo,
utilize a fórmula abaixo.

V = (PI * (R * R)) * A

Onde:
	V = Volume
	PI = 3.141592654
	R = Raio da circunferência da lata
	A = Altura da lata

 */


package variaveis_operadores_tiposDeDados;
import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        float raio = 0;
        float altura = 0;

        System.out.println("Digite o raio da lata: ");
        raio = read.nextFloat();

        System.out.println("Digite a altura da lata");
        altura = read.nextFloat();

        float volume = (float) (Math.PI * (raio * raio) * altura);

        System.out.println(volume + "cm ");
    }
}
