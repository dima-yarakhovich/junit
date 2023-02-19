package com.skypro.junit;

public class User {
    private final String login;
    private final String email;

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

    boolean checkSearch(String email) {
        if (email.contains("@") & email.contains(".")) {
            return true;
        } else {
            throw new IllegalArgumentException("Неверный email");
        }
    }

    boolean checkEquality(String email, String login) {
        if (email != login) {
            return true;
        }
        throw new IllegalArgumentException("Введены неверные данные");
    }
}
