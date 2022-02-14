package com.example.drehimagazin.service.impl;

import com.example.drehimagazin.repository.UserRepositroy;
import com.example.drehimagazin.service.UserService;
import com.example.drehimagazin.web.model.entities.UserEntity;
import com.example.drehimagazin.web.model.servicemodel.UserLogingServiceModel;
import com.example.drehimagazin.web.model.servicemodel.UserRegisterServiceModel;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

     private final UserRepositroy userRepositroy;
     private final ModelMapper modelMapper;

    public UserServiceImpl(UserRepositroy userRepositroy, ModelMapper modelMapper) {
        this.userRepositroy = userRepositroy;
        this.modelMapper = modelMapper;
    }

    @Override
    public void registerUser(UserRegisterServiceModel userServiceViewModel){
        UserEntity user = modelMapper.map(userServiceViewModel,UserEntity.class);
        userRepositroy.save(user);

    }

    @Override
    public UserLogingServiceModel findUserByUsernameAndPassword(String username, String password) {
    return userRepositroy.findByUsernameAndPassword(username,password)
            .map(userEntity -> modelMapper.map(userEntity,UserLogingServiceModel.class))
            .orElse(null);
}
}
