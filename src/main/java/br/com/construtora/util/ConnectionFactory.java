package br.com.construtora.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection getConnection() {
        try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            return DriverManager.getConnection(
                    ConfigFactoryUtil.getValor(ConfigFactoryUtil.URL),
                    ConfigFactoryUtil.getValor(ConfigFactoryUtil.USUARIO),
                    ConfigFactoryUtil.getValor(ConfigFactoryUtil.PASSOWRD));
        } catch (SQLException ex) {
            System.out.println(ConfigFactoryUtil.getValor(ConfigFactoryUtil.ERRO));
            ex.printStackTrace();
            return null;
        }
    }

}
