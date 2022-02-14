package com.example.drehimagazin.web;

import com.example.drehimagazin.service.impl.UserServiceImpl;
import com.example.drehimagazin.web.model.servicemodel.UserRegisterServiceModel;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
    public String registration(@Valid @ModelAttribute UserRegisterServiceModel userViewModel,
                               BindingResult bindingResult,
                               RedirectAttributes attributes){
        if (bindingResult.hasErrors()){
            return "redirect:register";
        }
        userService.registerUser(userViewModel);
        return "redirect:/user/login";
    }
}
