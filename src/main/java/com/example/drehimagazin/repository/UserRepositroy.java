package com.example.drehimagazin.repository;

import com.example.drehimagazin.web.model.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepositroy extends JpaRepository<UserEntity,Long> {

      Optional<UserEntity> findByUsernameAndPassword(String username,String password);
}
