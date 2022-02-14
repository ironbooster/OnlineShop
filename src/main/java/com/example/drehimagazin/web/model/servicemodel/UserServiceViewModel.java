package com.example.drehimagazin.web.model.servicemodel;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

public class UserServiceViewModel {

    @Email(message = "enter valid email address")
    private String email;
    @Length(min=2,message ="username length minimum 2 characters")
    private String username;
    @NotNull
    private String password;
    private String imageUrl;

    public UserServiceViewModel(){}

    public UserServiceViewModel setEmail(String email) {
        this.email = email;
        return this;
    }

    public UserServiceViewModel setUsername(String username) {
        this.username = username;
        return this;
    }

    public UserServiceViewModel setPassword(String password) {
        this.password = password;
        return this;
    }

    public UserServiceViewModel setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
