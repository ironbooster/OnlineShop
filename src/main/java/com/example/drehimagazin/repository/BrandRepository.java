package com.example.drehimagazin.repository;

import com.example.drehimagazin.web.model.entities.BrandEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<BrandEntity,Long> {
}
