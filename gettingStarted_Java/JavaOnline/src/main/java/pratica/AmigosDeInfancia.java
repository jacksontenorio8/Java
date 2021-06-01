package pratica;

public class AmigosDeInfancia {
    public static void main(String[] args) {

        String[] nomes = new String[4];
        nomes[0] = "David";
        nomes[1] = "Chiquinho";
        nomes[2] = "Jackson Lima";
        nomes[3] = "Ramom";
        System.out.println(nomes.length);

        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + " Amigo de infância: " + nomes[i]);
        }
    }
}
