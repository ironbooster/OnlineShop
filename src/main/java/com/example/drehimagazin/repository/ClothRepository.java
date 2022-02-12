package com.example.drehimagazin.repository;

import com.example.drehimagazin.repository.entities.ClothEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClothRepository extends JpaRepository<ClothEntity,Long> {
}
