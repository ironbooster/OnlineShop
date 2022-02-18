package com.example.drehimagazin.web.model.servicemodel;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.*;

public class UserRegisterServiceModel {
    @Email(message = "enter valid email address")
    private String email;
    @Size(min=2,max=15,message ="username length minimum 2 characters")
    private String username;
    @Size(min =2,max=15,message ="password length minimum 2 characters")
    private String password;
    private String imageUrl;
    private Long id;

    public Long getId() {
        return id;
    }

    public UserRegisterServiceModel setId(Long id) {
        this.id = id;
        return this;
    }

    public UserRegisterServiceModel(){}

    public UserRegisterServiceModel setEmail(String email) {
        this.email = email;
        return this;
    }


    public UserRegisterServiceModel setUsername(String username) {
        this.username = username;
        return this;
    }

    public UserRegisterServiceModel setPassword(String password) {
        this.password = password;
        return this;
    }

    public UserRegisterServiceModel setImageUrl(String imageUrl) {
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
