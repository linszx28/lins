/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua dos Beijas", "91", "apt 104", "411273-32", "Salvador", UnidadeFederativa.BAHIA);
        Juridica juridica = new Juridica("092328489", "001", "Ray", "719062363", "Ray@gmail.com", endereco);
        Cliente cliente = new Cliente("01", LocalDate.of(28, Month.MAY, 28), Genero.MASCULINO, "Luiz", "719723662", "Luiz@gmail.com", endereco);
        Motoboy motoboy = new Motoboy("8271932", "034627132", "627438641", "Dezembro", Setor.OPERACOES, 1.000, LocalDate.of(24, Month.MARCH, 1990), Genero.MASCULINO, "Alex", "719627326", "alex@gmail.com", endereco);
        Medico medico = new Medico("61", "78273923", "7342282", "Janeiro", Setor.SAUDE, 7.000, LocalDate.of(25, Month.JUNE, 2004), Genero.FEMININO, "Marcele", "719386236", "Marcele@gmail.com", endereco);
        Advogado advogado = new Advogado("9239292", "230892302", "9238273", "Fevereiro", Setor.JURIDICO, 10.000, LocalDate.of(10, Month.AUGUST, 2005), Genero.FEMININO, "Helena", "719837238", "Helena@gmail.com", endereco);
        
        System.out.println(endereco.toString());
        System.out.println("");
        System.out.println(juridica);
        System.out.println("");
        System.out.println(cliente);
        System.out.println("");
        System.out.println(motoboy);
        System.out.println("");
        System.out.println(advogado);
        System.out.println("");
        System.out.println(medico);
        
        
        
      
    }
}
