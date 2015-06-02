package br.com.construtora.facade;

import br.com.construtora.Interface.IAdministradorDao;
import java.util.List;
import br.com.construtora.daojdbc.ExceptionDao;
import br.com.construtora.daojdbc.FactoryDao;
import br.com.construtora.model.Cliente;
import br.com.construtora.model.Imovel;
import br.com.construtora.Interface.IClienteDao;
import br.com.construtora.Interface.IContratoDao;
import br.com.construtora.Interface.IFacade;
import br.com.construtora.Interface.IImovelDao;
import br.com.construtora.model.Administrador;
import br.com.construtora.model.Contrato;

public class Facade implements IFacade {

    private IClienteDao cliente;
    private IImovelDao imovel;
    private IAdministradorDao adm;
    private IContratoDao contrato;

    public Facade() {
        cliente = FactoryDao.createClienteDao();
        imovel = FactoryDao.createImovelDao();
        adm = FactoryDao.createAdmDao();
        contrato = FactoryDao.createContratoDao();
    }

    public void facadeInserirAdm(Administrador adm) throws Exception {

        try {
            this.adm.inserir(adm);

        } catch (ExceptionDao ex) {
            throw new Exception(ex.getMessage());

        }

    }

    public void facadeEditarAdm(Administrador adm) throws Exception {

        try {

            this.adm.editar(adm);
        } catch (ExceptionDao ex) {
            throw new Exception(ex.getMessage());

        }

    }

    public void facadeRemoverAdm(Administrador adm) throws Exception {

        try {

            this.adm.remover(adm);
        } catch (ExceptionDao ex) {
            throw new Exception(ex.getMessage());

        }
    }

    public List<Administrador> facadeListarAdministradores() throws Exception {

        try {

            return this.adm.listar();
        } catch (ExceptionDao ex) {
            throw new Exception(ex.getMessage());

        }
    }

    public Administrador facadeProcurarAdmSenha(String senha) throws Exception {
        return this.adm.getPorSenha(senha);
    }

    public void facadeInserirCliente(Cliente c) throws Exception {

        try {
            this.cliente.inserir(c);

        } catch (ExceptionDao ex) {
            throw new Exception(ex.getMessage());

        }

    }

    public void facadeEditarCliente(Cliente c) throws Exception {

        try {

            this.cliente.editar(c);
        } catch (ExceptionDao ex) {
            throw new Exception(ex.getMessage());

        }

    }

    public void facadeRemoverCliente(Cliente c) throws Exception {

        try {

            this.cliente.remover(c);
        } catch (ExceptionDao ex) {
            throw new Exception(ex.getMessage());

        }
    }

    public List<Cliente> facadeListarClientes() throws Exception {

        try {

            return this.cliente.listar();
        } catch (ExceptionDao ex) {
            throw new Exception(ex.getMessage());

        }
    }

    public Cliente facadeProcurarClienteSenha(String senha) throws Exception {
        return this.cliente.getPorSenha(senha);
    }

    public void facadeInserirImovel(Imovel i) throws Exception {

        try {
            this.imovel.inserir(i);

        } catch (ExceptionDao ex) {
            throw new Exception(ex.getMessage());

        }

    }

    public void facadeEditarImovel(Imovel i) throws Exception {

        try {

            this.imovel.editar(i);
        } catch (ExceptionDao ex) {
            throw new Exception(ex.getMessage());

        }

    }

    public void facadeRemoverImovel(Imovel i) throws Exception {

        try {

            this.imovel.remover(i);
        } catch (ExceptionDao ex) {
            throw new Exception(ex.getMessage());

        }

    }

    public List<Imovel> facadeListarImoveis() throws Exception {

        try {

            return this.imovel.listar();
        } catch (ExceptionDao ex) {
            throw new Exception(ex.getMessage());

        }
    }

    public Imovel facadeProcurarImovelSenha(String senha) throws Exception {

        try {

            return this.imovel.getPorSenha(senha);
        } catch (ExceptionDao ex) {
            throw new Exception(ex.getMessage());

        }
    }

    public void facadeInserirContrato(Contrato c) throws Exception {

        try {
            this.contrato.inserir(c);

        } catch (ExceptionDao ex) {
            throw new Exception(ex.getMessage());

        }

    }

    public void facadeEditarContrato(Contrato c) throws Exception {

        try {

            this.contrato.editar(c);
        } catch (ExceptionDao ex) {
            throw new Exception(ex.getMessage());

        }

    }

    public void facadeRemoverContrato(Contrato c) throws Exception {

        try {

            this.contrato.remover(c);
        } catch (ExceptionDao ex) {
            throw new Exception(ex.getMessage());

        }

    }

    public List<Contrato> facadeListarContratos() throws Exception {

        try {

            return this.contrato.listar();
        } catch (ExceptionDao ex) {
            throw new Exception(ex.getMessage());

        }
    }

    public Contrato facadeProcurarContrato(Long id) throws Exception {

        try {

            return this.contrato.getPorId(id);
        } catch (ExceptionDao ex) {
            throw new Exception(ex.getMessage());

        }
    }
}
