package com.skypro.junit;

public class User {
    private  String login;
    private  String email;

    public User(String login, String email) {
            this.login = login;
            this.email = email;
    }


    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }


    void checkSearch(String email) {
        if (!email.contains("@") || !email.contains(".")) {
            throw new EmailInvalidAddressException("Неверный email");
        }
    }


    void checkEquality(String email, String login) {
        if (email == login){
            throw new EmailInvalidAddressException("Введены неверные данные");
        }
    }

}
