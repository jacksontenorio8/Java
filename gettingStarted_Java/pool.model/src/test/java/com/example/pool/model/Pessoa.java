package com.example.pool.model;

public class Pessoa {

     public enum TipoPessoa{Física, Jurídica}

     public Integer codigo;
     public String nome;
     public String documento;
     public TipoPessoa tipo;
}
