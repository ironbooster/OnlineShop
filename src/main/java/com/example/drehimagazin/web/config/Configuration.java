package com.example.drehimagazin.web.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Configuration {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }


}
