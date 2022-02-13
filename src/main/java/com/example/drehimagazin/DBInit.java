package com.example.drehimagazin;

import com.example.drehimagazin.repository.BrandRepository;
import com.example.drehimagazin.repository.ClothesRepository;
import com.example.drehimagazin.repository.enums.ClothesType;
import com.example.drehimagazin.repository.enums.Sizes;
import com.example.drehimagazin.web.model.entities.BrandEntity;
import com.example.drehimagazin.web.model.entities.ClothesEntity;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class DBInit implements CommandLineRunner {

    private final BrandRepository brandRepository;
    private final ClothesRepository clothesRepository;

    public DBInit(BrandRepository brandRepository,
                  ClothesRepository clothesRepository) {
        this.brandRepository=brandRepository;
        this.clothesRepository=clothesRepository;

    }
    @Transactional
    @Override
    public void run(String... args) throws Exception {
        BrandEntity armani = new BrandEntity();
        armani.setBrand("Emprorio Armani").setImageURL("armani.jpg");
        ClothesEntity teniska = new ClothesEntity();
        teniska.setBrand(armani).setClothesType(ClothesType.Shirt).setImageURL("dreshka.jpg")
                        .setPrice(12.40).setSize(Sizes.M);
        brandRepository.save(armani);
        clothesRepository.save(teniska);



    }
}
