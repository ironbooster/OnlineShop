package com.example.drehimagazin.repository;

import com.example.drehimagazin.web.model.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositroy extends JpaRepository<UserEntity,Long> {


}
