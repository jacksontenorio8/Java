package br.com.abc.introduction;/*
* Se idade < 15 Categoria infantil
* Se idade >= 15 && idade < 18 Categoria juvenil
* Se idade >= 18 Categoria adulta
*/

public class ControleFluxo1 {
    public static void main(String[] args) {
        // Se tivermos uma extrussão de código não precisamos usar as chaves
        int idade = 15;
        String Categoria;
        if(idade < 15){
            Categoria = "Infantil";
        }else if(idade >= 15 && idade < 18) {
            Categoria = "Juvenil";
        }else{
            Categoria = "Adulta";
        }
        System.out.println(Categoria);
    }
}
