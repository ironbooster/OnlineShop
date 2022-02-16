package com.example.drehimagazin.web.model.servicemodel;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Size;

public class UserLogingServiceModel {
    @Size(min=2,message = "username must be minimum 2 characters")
    private String username;
    @Size(min=3,message = "password must be minimum 3 characters")
    private String password;


    public UserLogingServiceModel setUsername(String username) {
        this.username = username;
        return this;
    }

    public UserLogingServiceModel setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
