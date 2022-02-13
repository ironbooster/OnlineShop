package com.example.drehimagazin.repository;

import com.example.drehimagazin.web.model.entities.ClothesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClothesRepository extends JpaRepository<ClothesEntity,Long> {
}
