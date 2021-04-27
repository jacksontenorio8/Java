package br.com.digital.innovation.one.FatorialRecursivo;

public class FuncaoComLambda {
    public static void main(String[] args) {
        Funcao colocarPrefixoNaString = valor -> "Sr. "+valor;
        System.out.println(colocarPrefixoNaString.gerar("Jackson"));
    }
}
