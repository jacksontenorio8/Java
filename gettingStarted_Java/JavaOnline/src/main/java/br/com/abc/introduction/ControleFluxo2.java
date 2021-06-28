package br.com.abc.introduction;

public class ControleFluxo2 {
    public static void main(String[] args) {

        int idade = 20;
        String status;

        status = idade < 15 ? "Infantil" : idade >= 15 && idade < 18 ? "Juvenil" : "Adulto" ;

        System.out.println(status);
    }

}
