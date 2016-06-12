package com.rio4special.model;

public class Categoria {
    private int id;
    private String nome;

    public Categoria(){

    }

    public Categoria(int id, String nome){
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
