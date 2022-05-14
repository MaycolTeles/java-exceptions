package com.inatel.java.poo;

import java.util.HashSet;

public class Conta {

    // DECLARANDO OS ATRIBUTOS
    private double saldo;
    private double limite;
    private HashSet<Cliente> clientes;


    // DEFININDO OS MÉTODOS
    public Conta(float saldo, float limite, HashSet<Cliente> clientes) {
        this.saldo = saldo;
        this.limite = limite;
        this.clientes = clientes;
    }

    public void mostraInfo(){
        for(Cliente cliente : clientes){
            try {
                System.out.println("************************************");
                System.out.println("Nome: " + cliente.getNome());
                System.out.println("CPF: " + cliente.getCpf());
                System.out.println("Saldo: " + this.saldo);
                System.out.println("Limite: " + this.limite);
            } catch(NullPointerException e){
                System.out.println("Não há clientes cadastrados");
            }
        }
    }
    
}
