/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.construtora.util;

/**
 *
 * @author Felipe Lacerda
 */
public class Main {
    public static void main(String[] args) {
        String url = ConfigFactoryUtil.getValor(ConfigFactoryUtil.URL);
        
        System.out.println(url);
    }
}
