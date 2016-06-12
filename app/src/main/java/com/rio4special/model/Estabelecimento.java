package com.rio4special.model;

import java.util.Iterator;
import java.util.Set;

public class Estabelecimento {
    private int id;
    private String nome;
    private Float latitude;
    private Float longitude;
    private Categoria categoria;
    private Set<ItemAcessibilidade> itemAcessibilidade;
    private Set<Avaliacao> avaliacao;

    public Estabelecimento(){

    }

    public Estabelecimento(int id, String nome, Float latitude, Float longitude, Categoria categoria, Set<ItemAcessibilidade> itemAcessibilidade,
                           Set<Avaliacao> avaliacao){
        this.id = id;
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
        this.categoria = categoria;
        this.itemAcessibilidade = itemAcessibilidade;
        this.avaliacao = avaliacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Set<ItemAcessibilidade> getItemAcessibilidade(){
        return itemAcessibilidade;
    }

    public boolean adicionarItemAcessibilidade(ItemAcessibilidade itemAcessibilidade){
        return this.itemAcessibilidade.add(itemAcessibilidade);
    }

    public boolean removerItemAcessibilidade(ItemAcessibilidade itemAcessibilidade){
        return this.itemAcessibilidade.remove(itemAcessibilidade);
    }

    public Set<Avaliacao> getAvaliacao(){
        return avaliacao;
    }

    public boolean adicionarAvaliacao(Avaliacao avaliacao){
        return this.avaliacao.add(avaliacao);
    }

    public boolean removerAvaliacao(Avaliacao avaliacao){
        return this.avaliacao.remove(avaliacao);
    }

    public Double getAvaliacaoGeral(){
        Double notas = 0.0;
        Avaliacao av;
        Iterator<Avaliacao> avaliacaoIterator;

        avaliacaoIterator = avaliacao.iterator();
        while (avaliacaoIterator.hasNext()){
            av = avaliacaoIterator.next();
            notas += av.getNotas();
        }
        return notas;
    }

}
