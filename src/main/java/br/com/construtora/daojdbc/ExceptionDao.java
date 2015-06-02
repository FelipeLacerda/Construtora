package br.com.construtora.daojdbc;

public class ExceptionDao extends Exception {

    public ExceptionDao(String msg) {
        super(msg);
    }

    public ExceptionDao(Exception e) {
        super(e);
    }

    public ExceptionDao(String msg, Exception e) {
        super(msg, e);
    }

}
