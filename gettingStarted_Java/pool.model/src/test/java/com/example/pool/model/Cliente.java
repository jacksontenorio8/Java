package com.example.pool.model;

import java.util.List;

public class Cliente {
    public Integer codigo;
    public String nome;
    public String cpf;

    private List<Endereco> enderecos;

    public void setEnderecos(List<Endereco> enderecos){
        this.enderecos = enderecos;
    }

    public List<Endereco> getEnderecos() {
        if (enderecos == null){
            
        }
        return enderecos;
    }
}
