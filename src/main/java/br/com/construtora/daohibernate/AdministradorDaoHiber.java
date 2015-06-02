/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.construtora.daohibernate;

import br.com.construtora.daojdbc.ExceptionDao;
import br.com.construtora.model.Administrador;
import br.com.construtora.model.Contato;
import br.com.construtora.model.Endereco;
import br.com.construtora.model.Usuario;
import br.com.construtora.util.ConnectionFactory;
import br.com.construtora.util.MensagemUtilAdm;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Felipe Lacerda
 */
public class AdministradorDaoHiber {

    public void inserir(Administrador a) throws ExceptionDao {

    }

    public void editar(Administrador a) throws ExceptionDao {

    }

    public void remover(Administrador a) throws ExceptionDao {

    }

    public List<Administrador> listar() throws ExceptionDao {
        return null;
    }

    public Administrador getPorSenha(String senha) {
        return null;
    }
}
