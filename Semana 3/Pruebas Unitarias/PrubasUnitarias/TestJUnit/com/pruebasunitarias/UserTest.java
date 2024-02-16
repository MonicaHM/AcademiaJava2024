package com.pruebasunitarias;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UserTest {

    private Long userId;
    private String userName;
    private User user;

    @BeforeEach
    public void setUp(){
        userId = 0L;
        userName = "Mónica Hernández";
        user = new User(userId, userName);
    }

    @Test
    @DisplayName("Test Get User Id")
    void testGetUserId() {
        Assertions.assertEquals(userId, user.getId());
    }

    @Test
    @DisplayName("Test Get User Name")
    void testGetUserName() {
        Assertions.assertEquals(userName, user.getName());
    }

    @Test
    @DisplayName("Test User Equality")
    void testUserEquality() {
        User anotherUser = new User(userId, userName);
        Assertions.assertEquals(user, anotherUser);
    }

    @Test
    @DisplayName("Test User Inequality")
    void testUserInequality() {
        Long anotherUserId  = 1L;
        String anotherUserName = "Mon Hernández";
        User anotherUser  = new User(anotherUserId, anotherUserName);

        Assertions.assertNotEquals(anotherUser, user);
    }
}