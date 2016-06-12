package com.rio4special.model;

public class Foto {
    private int id;
    private String chaveRepositorioFotos;

    public Foto(){

    }

    public Foto(int id, String chaveRepositorioFotos){
        this.id = id;
        this.chaveRepositorioFotos = chaveRepositorioFotos;
    }

    public String getChaveRepositorioFotos(){
        return chaveRepositorioFotos;
    }

    public void setChaveRepositorioFotos(String chaveRepositorioFotos){
        this.chaveRepositorioFotos = chaveRepositorioFotos;
    }

}
