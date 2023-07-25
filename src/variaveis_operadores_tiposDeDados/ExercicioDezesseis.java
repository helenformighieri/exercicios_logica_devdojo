/*
Elabore uma rotina que apresente o valor do volume de uma esfera, utilize a fórmula abaixo:

V = (4 / 3) * PI * (R * R * R)

Onde:
V = Volume
PI= 3.141592654
R = Raio
 */

package variaveis_operadores_tiposDeDados;
public class ExercicioDezesseis {
    public static void main(String[] args) {

        float raio = 20;
        float pi = 3.141592654f;

        float volume = (4 / 3) * pi * (raio * raio * raio);

        System.out.println(volume);


    }
}
