package br.com.construtora.model;

public class Contrato {

    private long idContrato;
    private Cliente cliente = new Cliente();
    private Imovel imovel = new Imovel();
    private Administrador admin = new Administrador();

    private String certificacaoCli;
    private String certificacaoImo;
    private String certificacaoAdm;

    public String getCertificacaoCli() {
        return certificacaoCli;
    }

    public void setCertificacaoCli(String certificacaoCli) {
        this.certificacaoCli = certificacaoCli;
    }

    public String getCertificacaoImo() {
        return certificacaoImo;
    }

    public void setCertificacaoImo(String certificacaoImo) {
        this.certificacaoImo = certificacaoImo;
    }

    public String getCertificacaoAdm() {
        return certificacaoAdm;
    }

    public void setCertificacaoAdm(String certificacaoAdm) {
        this.certificacaoAdm = certificacaoAdm;
    }

    public long getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(long idContrato) {
        this.idContrato = idContrato;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public Administrador getAdmin() {
        return admin;
    }

    public void setAdmin(Administrador admin) {
        this.admin = admin;
    }

}
