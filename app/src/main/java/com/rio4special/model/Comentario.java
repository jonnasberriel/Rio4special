package com.rio4special.model;

import java.util.Date;
import java.util.Set;

public class Comentario {
    private int id;
    private String texto;
    private Date dataCriacao;
    private Foto foto;
    private Set<Denuncia> denuncia;

    public Comentario(){

    }

    public Comentario(String texto, Date dataCriacao, Foto foto, Set<Denuncia> denuncia){
        this.texto = texto;
        this.dataCriacao = dataCriacao;
        this.foto = foto;
        this.denuncia = denuncia;
    }

    public String getTexto(){
        return texto;
    }

    public void setTexto(String texto){
        this.texto = texto;
    }

    public Date getDataCriacao(){
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao){
        this.dataCriacao = dataCriacao;
    }

    public Foto getFoto(){
        return foto;
    }

    public void setFoto(Foto foto){
        this.foto = foto;
    }

    public Set<Denuncia> getDenuncia(){
        return denuncia;
    }

    public boolean adicionarDenuncia(Denuncia denuncia){
        return this.denuncia.add(denuncia);
    }

    public boolean removerDenuncia(Denuncia denuncia){
        return this.denuncia.remove(denuncia);
    }
}
