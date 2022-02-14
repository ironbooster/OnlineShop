package com.example.drehimagazin.service;

import com.example.drehimagazin.web.model.servicemodel.UserLogingServiceModel;
import com.example.drehimagazin.web.model.servicemodel.UserRegisterServiceModel;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    void registerUser(UserRegisterServiceModel userServiceViewModel);

    UserLogingServiceModel findUserByUsernameAndPassword(String username, String password);
}
