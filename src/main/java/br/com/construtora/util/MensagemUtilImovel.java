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
public class MensagemUtilImovel {

    private static final String FILE_NAME = "br/com/construtora/arquivopropriedade/mensagemImovel";

    public static final String MSG_SUCESSO_SALVARIMO = "msg_salvarImovel";
    public static final String MSG_ERRO_SALVARIMO = "msg_salvarImovel_erro";

    public static final String MSG_SUCESSO_PROCURARIMO = "msg_procurarImovel";
    public static final String MSG_ERRO_PROCURARIMO = "msg_procurarImovel_erro";

    public static final String MSG_SUCESSO_EDITARIMO = "msg_editarImovel";
    public static final String MSG_ERRO_EDITARIMO = "msg_editarImovel_erro";

    public static final String MSG_SUCESSO_LISTARIMO = "msg_listarImovel";
    public static final String MSG_ERRO_LISTARIMO = "msg_listarImovel_erro";

    public static final String MSG_SUCESSO_REMOVERIMO = "msg_removerImovel";
    public static final String MSG_ERRO_REMOVERIMO = "msg_removerImovel_erro";

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
