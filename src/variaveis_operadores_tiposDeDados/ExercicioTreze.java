
package variaveis_operadores_tiposDeDados;

public class ExercicioTreze {
    public static void main(String[] args) {

        float salarioAtual = 1300;
        float percentualReajuste = 8.9f;

        float salarioNovo = salarioAtual + (salarioAtual * percentualReajuste) / 100;

        System.out.println("Salario com novo percentual: " + salarioNovo);

    }
}
