package com.example.pool.model;
import com.example.pool.Cliente;
import com.example.pool.Endereco;


public class EntregaCartaoApp {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        // dados do endereço

        Cliente cliente = new Cliente();
        // dados do cliente

        cliente.adicionaEndereço(endereco);
        System.out.println("Endereço adicionado com sucesso!");
    }
}
