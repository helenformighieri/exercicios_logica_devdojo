

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
