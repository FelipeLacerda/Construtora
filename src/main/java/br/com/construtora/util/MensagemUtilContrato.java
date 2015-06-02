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
public class MensagemUtilContrato {

    private static final String FILE_NAME = "br/com/construtora/arquivopropriedade/mensagemContrato";

    public static final String MSG_SUCESSO_SALVARCONT = "msg_salvarCont";
    public static final String MSG_ERRO_SALVARCONT = "msg_salvarCont_erro";

    public static final String MSG_SUCESSO_PROCURARCONT = "msg_procurarCont";
    public static final String MSG_ERRO_PROCURARCONT = "msg_procurarCont_erro";

    public static final String MSG_SUCESSO_EDITARCONT = "msg_editarCont";
    public static final String MSG_ERRO_EDITARCONT = "msg_editarCont_erro";

    public static final String MSG_SUCESSO_LISTARCONT = "msg_listarCont";
    public static final String MSG_ERRO_LISTARCONT = "msg_listarCont_erro";

    public static final String MSG_SUCESSO_REMOVERCONT = "msg_removerCont";
    public static final String MSG_ERRO_REMOVERCONT = "msg_removerCont_erro";

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
