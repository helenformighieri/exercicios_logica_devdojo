/*
Efetuar o cálculo de quantos litros de combustível um automóvel consome em uma viagem.
Sabendo que o automóvel tem uma autonomia de 12 Km por litro de combustível, desenvolva
o cálculo utilizando a fórmula abaixo:

	D = TV
	LU= D / 12

	Onde:
		D = Distância em Km
		T = Tempo gasto na viagem
		V = Velocidade
 */

package variaveis_operadores_tiposDeDados;
import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int km = 0;
        int kmPorLitro = 12;

        System.out.println("Digite a kilometragem da viagem: ");
        km = read.nextInt();

        System.out.println("Você gastara: " + km / kmPorLitro + " Litros, nesta viagem.");



    }
}
