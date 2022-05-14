package com.inatel.java.poo;

public class Cliente {

    // DECLARANDO OS ATRIBUTOS
    private String nome;
    private String cpf;


    // DEFININDO OS MÉTODOS
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }
    
}
