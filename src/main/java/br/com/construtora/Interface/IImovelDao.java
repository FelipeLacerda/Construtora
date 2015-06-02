package br.com.construtora.Interface;

import java.util.List;
import br.com.construtora.daojdbc.ExceptionDao;
import br.com.construtora.model.Imovel;

public interface IImovelDao {

    public void inserir(Imovel i) throws ExceptionDao;

    public void editar(Imovel i) throws ExceptionDao;

    public void remover(Imovel i) throws ExceptionDao;

    public List<Imovel> listar() throws ExceptionDao;

    public Imovel getPorSenha(String senha) throws ExceptionDao;

}
