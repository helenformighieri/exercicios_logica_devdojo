package condicionais;

public class ExercicioOito {
    public static void main(String[] args) {

        float valor = 800;
        float taxa = 0.8f;
        int tempo = 10;

        float prestacao = valor + (valor *(taxa / 100) * tempo);

        System.out.println("Valor da prestação que esta em atraso á " + tempo + " dias: " + prestacao);
    }
}
