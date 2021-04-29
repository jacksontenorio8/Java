package br.com.digital.innovation.one.aula2;

import java.util.function.Supplier;
//Supridores
public class Suppliers {
    public static void main(String[] args) {
        Supplier<Pessoa> supplier = () -> new Pessoa();

        System.out.println(supplier.get());
    }
}

class Pessoa {
    private String nome;
    private Integer idade;

    public Pessoa(){
        nome = "Jackson";
        idade = 38;
    }

    @Override
    public String toString(){
        return String.format("nome: %s, idade: %d", nome, idade);
    }
}