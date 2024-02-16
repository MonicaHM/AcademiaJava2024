package com.pruebasunitarias;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UserServiceTest {

    private UserService userService;
    private Long userId;
    private String userName;
    private User expected;

    @BeforeEach
    public void setUp(){
        userService  = new UserService();
        userId = 0L;
        userName = "Mónica Hernández";
        expected = new User(userId, userName);
    }

    @Test
    @DisplayName("Test Create User")
    public void testCreateUser(){
        final User result  = userService.createUser(userId, userName);

        Assertions.assertEquals(userId, result.getId());
        Assertions.assertEquals(userName, result.getName());
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test Get User")
    public void testGetUser() {
        userService.createUser(userId, userName);
        final User result  = userService.getUser(userId);

        Assertions.assertNotNull(result);
        Assertions.assertEquals(userId, result.getId());
        Assertions.assertEquals(userName, result.getName());
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test Update User")
    public void testUpdateUser() {
        String updatedName = "Mon Hernández";

        userService.createUser(userId, userName);
        final User result  = userService.updateUser(userId, updatedName);

        Assertions.assertNotNull(result);
        Assertions.assertEquals(userId, result.getId());
        Assertions.assertEquals(updatedName, result.getName());
        Assertions.assertEquals(userService.getUser(userId), result);

    }
}
