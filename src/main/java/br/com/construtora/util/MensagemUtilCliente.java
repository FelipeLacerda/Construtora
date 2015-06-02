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
public class MensagemUtilCliente {

    private static final String FILE_NAME = "br/com/construtora/arquivopropriedade/mensagemCliente";

    public static final String MSG_SUCESSO_SALVARCLI = "msg_salvarCli";
    public static final String MSG_ERRO_SALVARCLI = "msg_salvarCli_erro";

    public static final String MSG_SUCESSO_PROCURARCLI = "msg_procurarCli";
    public static final String MSG_ERRO_PROCURARCLI = "msg_procurarCli_erro";

    public static final String MSG_SUCESSO_EDITARCLI = "msg_editarCli";
    public static final String MSG_ERRO_EDITARCLI = "msg_editarCli_erro";

    public static final String MSG_SUCESSO_LISTARCLI = "msg_listarCli";
    public static final String MSG_ERRO_LISTARCLI = "msg_listarCli_erro";

    public static final String MSG_SUCESSO_REMOVERCLI = "msg_removerCli";
    public static final String MSG_ERRO_REMOVERCLI = "msg_removerCli_erro";

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
