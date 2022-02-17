package com.example.drehimagazin.web;

import com.example.drehimagazin.service.impl.UserServiceImpl;
import com.example.drehimagazin.web.model.servicemodel.UserRegisterServiceModel;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class RegisterController {
     private final UserServiceImpl userService;

    public RegisterController(UserServiceImpl userService, ModelMapper modelMapper) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String register(){
    return "auth-register";
}

    @PostMapping("/register")
    public String registration(@Valid @ModelAttribute UserRegisterServiceModel userRegisterServiceModel,
                               BindingResult bindingResult,
                               RedirectAttributes attributes){
        if (bindingResult.hasErrors()){
            return "redirect:/user/register";
        }
        userService.registerUser(userRegisterServiceModel);
        return "redirect:/user/login";
    }
}
