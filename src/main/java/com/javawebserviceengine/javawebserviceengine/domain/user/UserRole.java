package com.javawebserviceengine.javawebserviceengine.domain.user;

public enum UserRole {
    ADMIN("admin"),
    USER("user");

    private String roles;

     UserRole(String roles) {
        this.roles = roles;
    }

    public String getRole() {
         return  roles;
    }
}
