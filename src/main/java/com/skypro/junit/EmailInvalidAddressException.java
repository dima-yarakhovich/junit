package com.skypro.junit;

public class EmailInvalidAddressException  extends RuntimeException{

    public EmailInvalidAddressException(String message) {
        super(message);
    }
    public EmailInvalidAddressException() {
    }
}
