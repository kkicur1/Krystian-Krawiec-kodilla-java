package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public final class ForumUser {

    private final String username;

    public ForumUser() {
        this.username = "John Smith";
    }

    public String getUsername() {
        return username;
    }
}
