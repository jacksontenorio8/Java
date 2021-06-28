package br.com.abc.introduction;

public class CoresEspectroMagnetico {
    public static void main(String[] args) {
        String[] cor = new String[6];
        cor[0] = "Vermelho";
        cor[1] = "Laranja";
        cor[2] = "Amarelo";
        cor[3] = "Verde";
        cor[4] = "Azul";
        cor[5] = "Violeta";
        System.out.println(cor.length);
        for (int i = 0; i< 6; i++){
            System.out.println((i + 1) + " Cor do Espectro Magnético: " + cor[i]);
        }
    }

}
