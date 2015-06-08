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
public class MensagemUtilUsuario {

    private static final String FILE_NAME = "mensagemUsuario";

    public static final String MSG_SUCESSO_SALVARUSU = "msg_salvarUsu";
    public static final String MSG_ERRO_SALVARUSU = "msg_salvarUsu_erro";

    public static final String CABE_SAIR = "cabecalho_sair";
    public static final String CABE_ERRO = "cabecalho_erro";
    public static final String CABE_CANCEL = "cabecalho_cancelar";
    public static final String CABE_CAD = "cabecalho_cadastrar";
    public static final String CABE_REM = "cabecalho_remover";
    public static final String CABE_LIST = "cabecalho_listar";
    public static final String CABE_PROC = "cabecalho_procurar";
    public static final String CABE_OBG = "cabecalho_obrigatorio";
    public static final String CABE_LOGIN = "cabecalho_login";

    public static final String MSG_LOGIN = "msg_login";
    public static final String MSG_SAIR = "msg_sair";
    public static final String MSG_CANCEL = "msg_cancelar";
    public static final String MSG_CAD = "msg_cadastrar";
    public static final String MSG_REM = "msg_remover";
    public static final String MSG_OBG = "msg_obrigatorio";
    public static final String MSG_CAMPO_CERTO = "msg_campo_certo";
    public static final String MSG_ESCOLHA = "msg_escolha";

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
