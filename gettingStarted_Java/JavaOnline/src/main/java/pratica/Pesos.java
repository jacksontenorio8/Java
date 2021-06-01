package pratica;

public class Pesos {
    public static void main(String[] args) {

        double[] peso = new double[7];

        peso[0] = 30.0;
        peso[1] = 63.2;
        peso[2] = 72.3;
        peso[4] = 78.0;
        peso[5] = 82.0;
        peso[6] = 76.3;

        System.out.println(peso.length);

        for (int i = 0; i < 7; i++) {
            System.out.println((i + 1) + " Pesos: " + peso[i]);
        }
    }
}
