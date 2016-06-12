package com.rio4special.model;

import java.util.Date;
import java.util.Iterator;
import java.util.Set;

public class Avaliacao {
    private RegistroEntrada registroEntrada;
    private Set<ItemAvaliacao> itemAvaliacao;
    private Date dataAvaliacao;

    public Avaliacao(){

    }

    public Avaliacao(RegistroEntrada registroEntrada, Set<ItemAvaliacao> itemAvaliacao, Date dataAvaliacao){
        this.registroEntrada = registroEntrada;
        this.itemAvaliacao = itemAvaliacao;
        this.dataAvaliacao = dataAvaliacao;
    }

    public RegistroEntrada getRegistroEntrada(){
        return registroEntrada;
    }

    public void setRegistroEntrada(RegistroEntrada registroEntrada){
        this.registroEntrada = registroEntrada;
    }

    public Set<ItemAvaliacao> getItemAvaliacao(){
        return itemAvaliacao;
    }

    public Date getDataAvaliacao(){
        return dataAvaliacao;
    }

    public void setDataAvaliacao(Date dataAvaliacao){
        this.dataAvaliacao = dataAvaliacao;
    }

    public boolean adicionarItemAvaliacao(ItemAvaliacao itemAvaliacao){
        return this.itemAvaliacao.add(itemAvaliacao);
    }

    public boolean removerItemAvaliacao(ItemAvaliacao itemAvaliacao){
        return this.itemAvaliacao.remove(itemAvaliacao);
    }

    public Double getNotas(){
        Double notas = 0.0;
        ItemAvaliacao ia;
        Iterator<ItemAvaliacao> itemAvaliacaoIterator;

        itemAvaliacaoIterator = itemAvaliacao.iterator();
        while (itemAvaliacaoIterator.hasNext()){
            ia = itemAvaliacaoIterator.next();
            notas += ia.getNota();
        }
        return notas;
    }


}
