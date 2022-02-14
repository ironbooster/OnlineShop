package com.example.drehimagazin.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class LoginController {

    @GetMapping("/login")
    public String showLogin(){
        return "auth-login";
    }

    @PostMapping("/login")
    public String Logging(){
        return "redirect:/index";
    }

}
