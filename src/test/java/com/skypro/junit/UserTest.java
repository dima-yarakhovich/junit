package com.skypro.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserTest {
    User user = new User("dima", "dima@mail.by");
    User user1 = new User(null, null);
    User user2 = new User("dima", "dima.mail.by");

    @Test
    @DisplayName("Проверка на заполнения полей")
    void creatTest() {
        Assertions.assertNotNull(user.getEmail());
        Assertions.assertNotNull(user.getLogin());
    }

    @Test
    @DisplayName("Проверка пустых полей")
    void checkZero() {
        Assertions.assertNull(user1.getEmail());
        Assertions.assertNull(user1.getLogin());
    }

    @Test
    @DisplayName("Проверка на равенство Login и Email")
    void checkEquality() {
        Assertions.assertNotEquals(user.getEmail(), user.getLogin());

    }

    @Test
    @DisplayName("Проверка наличия '@' и '.'")
    void checkSearch() {
        Assertions.assertTrue(user.getEmail().contains("@") & user.getEmail().contains("."));
    }

}
