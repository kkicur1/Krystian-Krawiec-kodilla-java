package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public final class ForumUser {

    private final String username="John Smith";

    public ForumUser() {
    }

    public String getUsername() {
        return username;
    }
}
