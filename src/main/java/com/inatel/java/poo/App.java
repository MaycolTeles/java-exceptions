package com.inatel.java.poo;

import java.util.HashSet;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        
        // CRIANDO OS CLIENTES
        Cliente cliente1 = new Cliente("João", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria", "987.654.321-00");
        Cliente cliente3 = null;

        HashSet<Cliente> clientes = new HashSet<Cliente>();

        // ADICIONANDO OS CLIENTES AO HASHSET
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);

        // CRIANDO A CONTA
        Conta conta = new Conta(100, 200, clientes);

        // PRINTANDO AS INFORMAÇÕES
        conta.mostraInfo();


        System.out.println("OK!");

    }
}
