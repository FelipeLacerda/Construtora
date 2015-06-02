/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.construtora.controller;

import br.com.construtora.Interface.IFacade;
import br.com.construtora.facade.Facade;
import br.com.construtora.model.Administrador;
import java.util.List;

/**
 *
 * @author Felipe Lacerda
 */
public class AdmController {

    private IFacade fachada = new Facade();

    public void salvarAdm(Administrador adm) throws Exception {
        fachada.facadeInserirAdm(adm);
    }

    public Administrador procurarAdm(String senha) throws Exception {
        return fachada.facadeProcurarAdmSenha(senha);
    }

    public List<Administrador> listarAdm() throws Exception {
        return fachada.facadeListarAdministradores();
    }

    public void removerAdm(Administrador adm) throws Exception {
        fachada.facadeRemoverAdm(adm);
    }

    public void atualizarAdm(Administrador adm) throws Exception {
        fachada.facadeEditarAdm(adm);
    }
}
