/*
Ler valores para as variáveis x e y, trocar os valores das variáveis e apresentar
o resultado dos valores invertidos.
 */

package variaveis_operadores_tiposDeDados;
public class ExercicioSete {
    public static void main(String[] args) {

        int x = 5;
        int y = 10;
        int z = x;

        System.out.println(y);
        System.out.println(x);

        System.out.println("~~~~~~~~~~~~");

        System.out.println(x = y);
        System.out.println(y = z);


    }
}
