/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.construtora.util;

import java.util.ResourceBundle;

/**
 *
 * @author Felipe Lacerda
 */
public class MensagemUtilAdm {

    private static final String FILE_NAME = "mensagemAdm";

    public static final String MSG_SUCESSO_SALVARADM = "msg_salvarAdm";
    public static final String MSG_ERRO_SALVARADM = "msg_salvarAdm_erro";

    public static final String MSG_SUCESSO_PROCURARADM = "msg_procurarAdm";
    public static final String MSG_ERRO_PROCURARADM = "msg_procurarAdm_erro";

    public static final String MSG_SUCESSO_EDITARADM = "msg_editarAdm";
    public static final String MSG_ERRO_EDITARADM = "msg_editarAdm_erro";

    public static final String MSG_SUCESSO_LISTARADM = "msg_listarAdm";
    public static final String MSG_ERRO_LISTARADM = "msg_listarAdm_erro";

    public static final String MSG_SUCESSO_REMOVERADM = "msg_removerAdm";
    public static final String MSG_ERRO_REMOVERADM = "msg_removerAdm_erro";

    private static ResourceBundle bundle;

    static {
        bundle = ResourceBundle.getBundle(FILE_NAME);
    }

    public static String getValor(String chave) {
        return bundle.getString(chave);
    }

    public static String getValor(String chave, String valor) {
        return String.format(bundle.getString(chave), valor);
    }
}
