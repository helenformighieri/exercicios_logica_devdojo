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
