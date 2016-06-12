package com.rio4special.model;

public class ItemAcessibilidade {
    private Estabelecimento estabelecimento;
    private Acessibilidade acessibilidade;

    public ItemAcessibilidade(){

    }

    public ItemAcessibilidade(Estabelecimento estabelecimento){
        this.estabelecimento = estabelecimento;
    }

    public ItemAcessibilidade(Estabelecimento estabelecimento, Acessibilidade acessibilidade){
        this.estabelecimento = estabelecimento;
        this.acessibilidade = acessibilidade;
    }

    public Estabelecimento getEstabelecimento(){
        return estabelecimento;
    }

    public void setEstabelecimento(Estabelecimento estabelecimento){
        this.estabelecimento = estabelecimento;
    }

    public Acessibilidade getAcessibilidade(){
        return acessibilidade;
    }

    public void setAcessibilidade(Acessibilidade acessibilidade){
        this.acessibilidade = acessibilidade;
    }

}
