package com.rio4special.model;

import java.util.Date;

public class Denuncia {

    private int id;
    private String descricao;
    private Date dataCriacao;
    private Usuario denunciante;
    private String x;
    private String yyy;

    public Denuncia(){}

    public Denuncia(int id, String descricao, Date dataCriacao, Usuario denunciante){
        this.id = id;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
        this.denunciante = denunciante;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public Date getDataCriacao(){
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao){
        this.dataCriacao = dataCriacao;
    }

    public Usuario getDenunciante(){
        return denunciante;
    }

    public void setDenunciante(Usuario denunciante){
        this.denunciante = denunciante;
    }

}





















