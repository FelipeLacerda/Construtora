/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.construtora.controller;

import br.com.construtora.Interface.IFacade;
import br.com.construtora.facade.Facade;
import br.com.construtora.model.Imovel;
import java.util.List;

/**
 *
 * @author Felipe Lacerda
 */
public class ImovelController {

    private IFacade fachada = new Facade();

    public void salvarImovel(Imovel imovel) throws Exception {
        fachada.facadeInserirImovel(imovel);
    }

    public Imovel procurarImovelSenha(String senha) throws Exception {
        return fachada.facadeProcurarImovelSenha(senha);
    }

    public List<Imovel> listarImoveis() throws Exception {
        return fachada.facadeListarImoveis();
    }

    public void removerImovel(Imovel imovel) throws Exception {
        fachada.facadeRemoverImovel(imovel);
    }

    public void atualizarImovel(Imovel imovel) throws Exception {
        fachada.facadeEditarImovel(imovel);
    }
}
