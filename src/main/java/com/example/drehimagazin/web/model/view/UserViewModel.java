package com.example.drehimagazin.web.model.view;

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
