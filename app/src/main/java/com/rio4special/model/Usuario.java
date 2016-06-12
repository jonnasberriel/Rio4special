package com.rio4special.model;

public class Usuario {

    private int id;
    private String nome;
    private String email;
    private String idRepositorioFotos;

    public Usuario(){

    }

    public Usuario(int id, String nome, String email, String idRepositorioFotos){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.idRepositorioFotos = idRepositorioFotos;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getIdRepositorioFotos(){
        return idRepositorioFotos;
    }

    public void setIdRepositorioFotos(String idRepositorioFotos){
        this.idRepositorioFotos = idRepositorioFotos;
    }

    public void atualizarIdRepositorioFotos(String idRepositorioFotos){
        this.idRepositorioFotos = idRepositorioFotos;
    }

}
