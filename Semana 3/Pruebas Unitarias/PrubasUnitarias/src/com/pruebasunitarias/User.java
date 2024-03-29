package com.pruebasunitarias;

import java.util.Objects;

public class User {
    final Long id;
    final String name;

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(name, user.name);
    }
}
