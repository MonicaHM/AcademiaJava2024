package com.pruebasunitarias;

import java.util.HashMap;

public class UserService {
    private final HashMap<Long, User> users = new HashMap<Long, User>();

    public User createUser(Long id, String name){
        users.put(id, new User(id,name));
        return users.get(id);
    }

    public User getUser(Long id){
        return users.get(id);
    }

    public User updateUser(Long id, String name){
        users.put(id, new User(id, name));
        return users.get(id);
    }
}