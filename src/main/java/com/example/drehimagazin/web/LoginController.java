package com.example.drehimagazin.web;

import com.example.drehimagazin.service.impl.UserServiceImpl;
import com.example.drehimagazin.web.model.servicemodel.UserLogingServiceModel;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.naming.Binding;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class LoginController {

    private final UserServiceImpl userService;

    public LoginController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String showLogin(){
        return "auth-login";
    }

    @PostMapping("/login")
    public String logging(@Valid @ModelAttribute UserLogingServiceModel userLogingServiceModel,
                          BindingResult bindingResult, RedirectAttributes redirectAttributes,
                          HttpSession httpSession){
        if(bindingResult.hasErrors()){
            return "redirect:/login";
        }

        UserLogingServiceModel user = userService
                .findUserByUsernameAndPassword(userLogingServiceModel.getUsername(),
                userLogingServiceModel.getPassword());

        if(user==null){
            return "redirect:/login";
        }



        httpSession.setAttribute("user",user);

        return "redirect:/index";
    }

}
