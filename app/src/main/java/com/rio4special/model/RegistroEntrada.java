package com.rio4special.model;

import java.util.Date;
import java.util.Set;

public class RegistroEntrada {
    private int id;
    private Date dataRegistroEntrada;
    private Usuario usuario;
    private Estabelecimento estabelecimento;
    private Set<Comentario> comentario;

    public RegistroEntrada(){

    }

    public RegistroEntrada(int id, Date dataRegistroEntrada, Usuario usuario, Estabelecimento estabelecimento, Set<Comentario> comentario){
        this.id = id;
        this.dataRegistroEntrada = dataRegistroEntrada;
        this.usuario = usuario;
        this.estabelecimento = estabelecimento;
        this.comentario = comentario;
    }

    public Date getDataRegistroEntrada(){
        return dataRegistroEntrada;
    }

    public void setDataRegistroEntrada(Date dataRegistroEntrada){
        this.dataRegistroEntrada = dataRegistroEntrada;
    }

    public Usuario getUsuario(){
        return usuario;
    }

    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }

    public Estabelecimento getEstabelecimento(){
        return estabelecimento;
    }

    public void setEstabelecimento(Estabelecimento estabelecimento){
        this.estabelecimento = estabelecimento;
    }

    public Set<Comentario> getComentarios(){
        return comentario;
    }

    public boolean adicionarComentario(Comentario comentario){
        return this.comentario.add(comentario);
    }

    public boolean removerComentario(Comentario comentario){
        return this.comentario.remove(comentario);
    }
}
