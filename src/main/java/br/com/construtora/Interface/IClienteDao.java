package br.com.construtora.Interface;

import java.util.List;

import br.com.construtora.daojdbc.ExceptionDao;
import br.com.construtora.model.Cliente;

public interface IClienteDao {

    public void inserir(Cliente c) throws ExceptionDao;

    public void editar(Cliente c) throws ExceptionDao;

    public void remover(Cliente c) throws ExceptionDao;

    public List<Cliente> listar() throws ExceptionDao;

    public Cliente getPorSenha(String senha) throws ExceptionDao;
}
