/*
Construa um programa que calcule a velocidade em metros por segundo de um projétil
que percorre uma distância em quilômetros a um espaço de tempo em minutos, utilize a fórmula abaixo:

V = (D * 1000) / (T * 60)

Onde:
	V = Velocidade em m/s
	D = Distância
	T = Tempo
 */

package variaveis_operadores_tiposDeDados;
public class ExercicioQuinze {
    public static void main(String[] args) {
        float distancia = 300;
        float tempo = 120;

        float velocidade = (distancia * 1000) / (tempo * 60);

        System.out.println(velocidade);
    }
}
