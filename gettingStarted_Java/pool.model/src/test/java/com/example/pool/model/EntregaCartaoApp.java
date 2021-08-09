package com.example.pool.model;


public class EntregaCartaoApp {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.cep = "00000000";
        // dados do endereço

        Cliente cliente = new Cliente();
        // dados do cliente

        try {
            cliente.adicionaEndereço(endereco);
            System.out.println("Endereço adicionado com sucesso!");
        } catch (Exception e) {
            System.err.println("Houve um erro ao adcionar endereço: " + e.getMessage());
        }

    }
}
