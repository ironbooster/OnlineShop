package com.example.drehimagazin.repository;

import com.example.drehimagazin.repository.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositroy extends JpaRepository<UserEntity,Long> {


}
