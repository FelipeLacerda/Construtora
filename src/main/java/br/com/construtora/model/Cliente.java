package br.com.construtora.model;

import java.util.Date;

public class Cliente {

    private Long idCli;
    private String nomeCli;
    private String cpfCli;
    private Date dataNascimento;
    private Contato contatoCli = new Contato();
    private Endereco enderecoCli = new Endereco();
    private Usuario usuarioCli = new Usuario();

    public Usuario getUsuarioCli() {
        return usuarioCli;
    }

    public void setUsuarioCli(Usuario usuarioCli) {
        this.usuarioCli = usuarioCli;
    }

    public Long getIdCli() {
        return idCli;
    }

    public void setIdCli(Long id) {
        this.idCli = id;
    }

    public String getNomeCli() {
        return nomeCli;
    }

    public void setNomeCli(String nome) {
        this.nomeCli = nome;
    }

    public String getCpfCli() {
        return cpfCli;
    }

    public void setCpfCli(String cpf) {
        this.cpfCli = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Contato getContatoCli() {
        return contatoCli;
    }

    public void setContatoCli(Contato contato) {
        this.contatoCli = contato;
    }

    public Endereco getEnderecoCli() {
        return enderecoCli;
    }

    public void setEnderecoCli(Endereco endereco) {
        this.enderecoCli = endereco;
    }

}
