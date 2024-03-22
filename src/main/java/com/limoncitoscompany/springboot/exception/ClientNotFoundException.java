package com.limoncitoscompany.springboot.exception;

public class ClientNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public ClientNotFoundException(Long id){
        super("The product with" + id + " cannot be found.");
    }
}
