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
public class ConfigFactoryUtil {
     
    public static final String FILE_NAME = "br/com/construtora/arquivopropriedade/configuracoes";
    public static final String URL = "url";
    public static final String USUARIO = "login";
    public static final String PASSOWRD = "senha";
    
    public static final String ERROLINHA = "erroLinha";
    
    public static final String ERRO = "erro";
    
    private static ResourceBundle bundle;
    
    static{
        bundle = ResourceBundle.getBundle(FILE_NAME);
    }
    
    public static String getValor(String chave){
        return bundle.getString(chave);
    }
    
}
