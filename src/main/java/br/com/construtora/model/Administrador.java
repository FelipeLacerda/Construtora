package br.com.construtora.model;

public class Administrador {

    private long idAdm;
    private String nomeAdm;
    private String cpfAdm;
    private Contato contatoAdm = new Contato();
    private Endereco enderecoAdm = new Endereco();
    private Usuario usuarioAdm = new Usuario();

    public Usuario getUsuarioAdm() {
        return usuarioAdm;
    }

    public void setUsuarioAdm(Usuario usuarioAdm) {
        this.usuarioAdm = usuarioAdm;
    }

    public String getNomeAdm() {
        return nomeAdm;
    }

    public void setNomeAdm(String nome) {
        this.nomeAdm = nome;
    }

    public String getCpfAdm() {
        return cpfAdm;
    }

    public void setCpfAdm(String cpf) {
        this.cpfAdm = cpf;
    }

    public void setIdAdm(long id) {
        this.idAdm = id;
    }

    public long getIdAdm() {
        return idAdm;
    }

    public Contato getContatoAdm() {
        return contatoAdm;
    }

    public void setContatoAdm(Contato contatoAdm) {
        this.contatoAdm = contatoAdm;
    }

    public Endereco getEnderecoAdm() {
        return enderecoAdm;
    }

    public void setEnderecoAdm(Endereco enderecoAdm) {
        this.enderecoAdm = enderecoAdm;
    }

}
