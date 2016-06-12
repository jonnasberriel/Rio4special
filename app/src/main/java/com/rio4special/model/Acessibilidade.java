package com.rio4special.model;

public class Acessibilidade {
    private int id;
    private String nome;

    public Acessibilidade(){

    }

    public Acessibilidade(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

}
