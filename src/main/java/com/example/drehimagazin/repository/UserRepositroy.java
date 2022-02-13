package com.example.drehimagazin.repository;

import com.example.drehimagazin.web.model.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositroy extends JpaRepository<UserEntity,Long> {


}
