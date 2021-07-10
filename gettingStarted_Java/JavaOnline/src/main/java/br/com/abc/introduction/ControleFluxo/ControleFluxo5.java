package br.com.abc.introduction.ControleFluxo;

public class ControleFluxo5 {
    public static void main(String[] args) {
        /*Dado um valor de um carro descubra em quantas vezes ele pode ser parcelado.
         * Porém as parcelas não podem ser menores que 1000.
         * */

        double valorTotal = 30000;
        for (int parcela = 0; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela "+ parcela + " R$" +valorParcela);
        }
    }

    public static class CoresEspectroMagnetico {
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
}
