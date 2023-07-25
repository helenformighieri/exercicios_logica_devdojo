package variaveis_operadores_tiposDeDados;

public class ExercicioDez {
    public static void main(String[] args) {


        int valor = 5;
        int potencia = 10;

        int aoQuadrado = valor * valor;
        int aoCubo = valor * valor * valor;
        int decimaPotencia = (int) Math.pow(valor, potencia);

        System.out.println(valor + " ao quadrado: " + aoQuadrado);
        System.out.println(valor + " ao cubo: " + aoCubo);
        System.out.println(valor + " a decima potencia: " + decimaPotencia);

        double total = aoQuadrado + aoCubo + decimaPotencia;
        System.out.println("Soma dos três valores: " + total);
    }
}
