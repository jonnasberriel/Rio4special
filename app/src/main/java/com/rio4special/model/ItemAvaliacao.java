package com.rio4special.model;

public class ItemAvaliacao {
    private ItemAcessibilidade itemAcessibilidade;
    private Double nota;

    public ItemAvaliacao(){

    }

    public ItemAvaliacao(ItemAcessibilidade itemAcessibilidade){
        this.itemAcessibilidade = itemAcessibilidade;
    }

    public ItemAcessibilidade getItemAcessibilidade(){
        return itemAcessibilidade;
    }

    public void setItemAcessibilidade(ItemAcessibilidade itemAcessibilidade){
        this.itemAcessibilidade = itemAcessibilidade;
    }

    public Double getNota(){
        return nota;
    }

    public void setNota(Double nota){
        this.nota = nota;
    }
}
