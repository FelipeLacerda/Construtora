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
public class MensagemUtilRelatorio {

    private static final String FILE_NAME = "mensagemRelatorio";

    public static final String MSG_SUCESSO = "msg_sucesso";
    public static final String MSG_ERRO = "msg_erro";

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
