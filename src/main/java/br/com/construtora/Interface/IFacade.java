package br.com.construtora.Interface;

import br.com.construtora.model.Administrador;
import java.util.List;
import br.com.construtora.model.Cliente;
import br.com.construtora.model.Contrato;
import br.com.construtora.model.Imovel;

public interface IFacade {

    public void facadeInserirAdm(Administrador adm) throws Exception;

    public void facadeEditarAdm(Administrador adm) throws Exception;

    public void facadeRemoverAdm(Administrador adm) throws Exception;

    public List<Administrador> facadeListarAdministradores() throws Exception;

    public Administrador facadeProcurarAdmSenha(String senha) throws Exception;

    public void facadeInserirCliente(Cliente cliente) throws Exception;

    public void facadeEditarCliente(Cliente c) throws Exception;

    public void facadeRemoverCliente(Cliente c) throws Exception;

    public List<Cliente> facadeListarClientes() throws Exception;

    public Cliente facadeProcurarClienteSenha(String senha) throws Exception;

    public void facadeInserirImovel(Imovel i) throws Exception;

    public void facadeEditarImovel(Imovel i) throws Exception;

    public void facadeRemoverImovel(Imovel i) throws Exception;

    public List<Imovel> facadeListarImoveis() throws Exception;

    public Imovel facadeProcurarImovelSenha(String senha) throws Exception;

    public void facadeInserirContrato(Contrato c) throws Exception;

    public void facadeEditarContrato(Contrato c) throws Exception;

    public void facadeRemoverContrato(Contrato c) throws Exception;

    public List<Contrato> facadeListarContratos() throws Exception;

    public Contrato facadeProcurarContrato(Long id) throws Exception;
}
