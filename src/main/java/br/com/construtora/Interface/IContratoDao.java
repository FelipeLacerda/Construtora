
package br.com.construtora.Interface;

import br.com.construtora.daojdbc.ExceptionDao;
import br.com.construtora.model.Contrato;
import java.util.List;

/**
 *
 * @author Felipe Lacerda
 */
public interface IContratoDao {
    
    public void inserir(Contrato c) throws ExceptionDao;

    public void editar(Contrato c) throws ExceptionDao;

    public void remover(Contrato c) throws ExceptionDao;

    public List<Contrato> listar() throws ExceptionDao;

    public Contrato getPorId(Long id)throws ExceptionDao;
}
