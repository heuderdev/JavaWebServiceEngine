package com.javawebserviceengine.javawebserviceengine.domain.user;

public record RegisterDTO(String username, String password, String email, UserRole roles) {
}
