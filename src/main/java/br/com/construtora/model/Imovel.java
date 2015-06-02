package br.com.construtora.model;

public class Imovel {

    private String idImovel;
    private double tamanho;
    private double preco;
    private Endereco endereco = new Endereco();
    private String especificacao;
    private String andamentoObra;

    public String getIdImovel() {
        return idImovel;
    }

    public void setIdImovel(String idImovel) {
        this.idImovel = idImovel;
    }

    public Endereco getEnderecoImovel() {
        return endereco;
    }

    public void setEnderecoImovel(Endereco endereco) {
        this.endereco = endereco;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public String getEspecificacao() {
        return especificacao;
    }

    public void setEspecificacao(String especificacao) {
        this.especificacao = especificacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getAndamentoObra() {
        return andamentoObra;
    }

    public void setAndamentoObra(String andamentoObra) {
        this.andamentoObra = andamentoObra;
    }

    public String toString() {
        return "C�digo: " + this.idImovel + " || Tamanho: " + this.tamanho
                + " || Pre�o: " + this.preco + " || Andamento da Obra: "
                + this.andamentoObra;
    }

}
