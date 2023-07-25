/*
Calcular e apresentar o valor de uma prestação em atraso, utilize a fórmula abaixo:

P = VALOR + (VALOR * (TAXA/100) * TEMPO)

Onde P é o valor da prestação em atraso.

 */

package variaveis_operadores_tiposDeDados;
public class ExercicioOito {
    public static void main(String[] args) {

        float valor = 800;
        float taxa = 0.8f;
        int tempo = 10;

        float prestacao = valor + (valor *(taxa / 100) * tempo);

        System.out.println("Valor da prestação que esta em atraso á " + tempo + " dias: " + prestacao);
    }
}
