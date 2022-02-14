package com.example.drehimagazin.web.model.view;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

public class UserViewModel {

    private String email;
    private String username;
    private String password;
    private String imageUrl;

    public UserViewModel(){}

    public UserViewModel setEmail(String email) {
        this.email = email;
        return this;
    }

    public UserViewModel setUsername(String username) {
        this.username = username;
        return this;
    }

    public UserViewModel setPassword(String password) {
        this.password = password;
        return this;
    }

    public UserViewModel setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    @Email(message = "enter valid email address")
    public String getEmail() {
        return email;
    }

     @Length(min=2,message ="username length minimum 2 characters")
    public String getUsername() {
        return username;
    }
@NotNull
    public String getPassword() {
        return password;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
