package br.com.digital.innovation.one.aula2;

import java.util.function.Function;

public class Funcoes {

    public static void main(String[] args) {

        Function<String, String> retorNarNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        Function<String, Integer> converterStringParaInteiroECalcularOTripulo = string -> Integer.valueOf(string) * 3;

        System.out.println(retorNarNomeAoContrario.apply("Jackson"));
        System.out.println(converterStringParaInteiroECalcularOTripulo.apply("33"));
    }

}
