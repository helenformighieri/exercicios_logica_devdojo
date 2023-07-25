/*
Desenvolver um programa que apresente e calcule o volume de uma caixa retangular,
utilize a fórmula abaixo:

V = C * L * A

Onde:
	V = Volume em cm3
	C = Comprimento
	L = Largura
	A = Altura
 */

package variaveis_operadores_tiposDeDados;
public class ExercicioNove {
    public static void main(String[] args) {

        int comprimento = 50;
        int largura = 30;
        int altura = 10;

        float volume = (comprimento * largura * altura) / 1000;

        System.out.println(volume);
    }
}
