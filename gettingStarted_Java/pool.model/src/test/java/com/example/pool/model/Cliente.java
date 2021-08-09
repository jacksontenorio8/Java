package com.example.pool.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {

    public String numCartao;
    private List<Endereco> enderecos;

    public void adicionaEndereço(Endereco endereco){
        if (endereco == null){
            throw new NullPointerException("Endereço não pode ser nulo.");
        }
        if(endereco.cep == null){
            throw new NullPointerException("CEP não pode ser nulo.");
        }
        getEnderecos().add(endereco);
    }

    public void setEnderecos(List<Endereco> enderecos){
        this.enderecos = enderecos;
    }

    public List<Endereco> getEnderecos() {
        if (enderecos == null){
            enderecos = new ArrayList<Endereco>();
        }
        return enderecos;
    }
}
