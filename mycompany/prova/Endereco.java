/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova;

/**
 *
 * @author Aluno
 */
public class Endereco {
    protected String logradouro;
    protected String numero;
    protected String complemneto;
    protected String cep;
    protected String cidade;
    protected UnidadeFederativa uf;

    public Endereco(String logradouro, String numero, String complemneto, String cep, String cidade, UnidadeFederativa uf) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemneto = complemneto;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemneto() {
        return complemneto;
    }

    public void setComplemneto(String complemneto) {
        this.complemneto = complemneto;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public UnidadeFederativa getUf() {
        return uf;
    }

    public void setUf(UnidadeFederativa uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "\n Endereço:" + 
                "\n Logradouro:" + logradouro + 
                "\n Número:" + numero + 
                "\n Complemneto:" + complemneto + 
                "\n CEP:" + cep + 
                "\n Cidade:" + cidade + 
                "\n UF:" + uf.getNome() +
                "\n Sigla:" + uf.getSigla();
    }

  


   
        
    
    
    
}
