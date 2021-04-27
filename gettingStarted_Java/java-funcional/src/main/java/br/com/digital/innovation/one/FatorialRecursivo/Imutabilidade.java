package br.com.digital.innovation.one.FatorialRecursivo;

import java.util.function.UnaryOperator;

public class Imutabilidade {
    public static void main(String[] args) {
        int valor = 20;
        UnaryOperator<Integer> retornarDobro = v -> v * 2;
        System.out.println(retornarDobro.apply(valor)); // Retornar o dobro do valor
        System.out.println(valor); // O valor não será alterado.
    }
}
