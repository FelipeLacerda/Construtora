/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.construtora.controller;

import br.com.construtora.Interface.IFacade;
import br.com.construtora.facade.Facade;
import br.com.construtora.model.Contrato;
import java.util.List;

/**
 *
 * @author Felipe Lacerda
 */
public class ContratoController {

    private IFacade fachada = new Facade();

    public void salvarContrato(Contrato contrato) throws Exception {
        fachada.facadeInserirContrato(contrato);
    }

    public Contrato procurarContrato(Long id) throws Exception {
        return fachada.facadeProcurarContrato(id);
    }

    public List<Contrato> listarContratos() throws Exception {
        return fachada.facadeListarContratos();
    }

    public void removerContrato(Contrato contrato) throws Exception {
        fachada.facadeRemoverContrato(contrato);
    }

    public void atualizarContrato(Contrato contrato) throws Exception {
        fachada.facadeEditarContrato(contrato);
    }
}
