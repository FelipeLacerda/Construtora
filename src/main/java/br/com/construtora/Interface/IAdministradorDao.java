package br.com.construtora.Interface;

import java.util.List;

import br.com.construtora.daojdbc.ExceptionDao;
import br.com.construtora.model.Administrador;

public interface IAdministradorDao {

    public void inserir(Administrador a) throws ExceptionDao;

    public void editar(Administrador a) throws ExceptionDao;

    public void remover(Administrador a) throws ExceptionDao;

    public List<Administrador> listar() throws ExceptionDao;

    public Administrador getPorSenha(String senha);

}
