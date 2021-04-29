package br.com.digital.innovation.one.aula2;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Interacoes {
    public static void main(String[] args) {
        String[] nomes = {"Jackson", "Tenorio", "Silva","Aluno","Java"};
        Integer[] numeros = {1, 2, 3, 4, 5};
        imprimirNomesFiltrados(nomes);
    }

    public static void imprimirNomesFiltrados(String... nomes) {
        String nomesParaImprimir="";
        for(int i = 0; i < nomes.length; i++){
            if(nomes[i].equals("Jackson")){
                nomesParaImprimir+=""+nomes[i];
            }
        }

        System.out.println("Nomes do for: "+nomesParaImprimir);

        String nomesParaImprimirDaStream = Stream.of(nomes)
                .filter(nome->nome.equals("Jackson"))
                .collect(Collectors.joining()); //String
        System.out.println("Nomes do Sream: "+nomesParaImprimirDaStream);

    }

    public static void imprimirTodosOsNomes(String... nomes) {
        for (String nome: nomes){
            System.out.println(nome);
        }
    }

    public static void imprimirODobroDeCadaItemDaLista(Integer... numeros) {
        for (Integer numero: numeros) {
            System.out.println(numero*2);
        }

    }
}
