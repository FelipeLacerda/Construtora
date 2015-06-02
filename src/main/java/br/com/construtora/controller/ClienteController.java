/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.construtora.controller;

import br.com.construtora.Interface.IFacade;
import br.com.construtora.facade.Facade;
import br.com.construtora.model.Cliente;
import java.util.List;

/**
 *
 * @author Felipe Lacerda
 */
public class ClienteController {

    private IFacade fachada = new Facade();

    public void salvarCliente(Cliente cliente) throws Exception {
        fachada.facadeInserirCliente(cliente);
    }

    public Cliente procurarCliente(String senha) throws Exception {
        return fachada.facadeProcurarClienteSenha(senha);
    }

    public List<Cliente> listarClientes() throws Exception {
        return fachada.facadeListarClientes();
    }

    public void removerCliente(Cliente cliente) throws Exception {
        fachada.facadeRemoverCliente(cliente);
    }

    public void atualizarCliente(Cliente cliente) throws Exception {
        fachada.facadeEditarCliente(cliente);
    }
}
