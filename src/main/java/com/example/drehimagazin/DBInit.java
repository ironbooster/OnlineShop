package com.example.drehimagazin;

import com.example.drehimagazin.repository.BrandRepository;
import com.example.drehimagazin.repository.ClothesRepository;
import com.example.drehimagazin.repository.enums.ClothesType;
import com.example.drehimagazin.repository.enums.Sizes;
import com.example.drehimagazin.web.model.entities.BrandEntity;
import com.example.drehimagazin.web.model.entities.ClothesEntity;
import com.example.drehimagazin.web.model.view.BrandViewModel;
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
        armani.setBrand("Emprorio Armani").setImageURL("https://logoeps.com/wp-content/uploads/2011/08/emporio-armani-logo.jpg");
        ClothesEntity teniska = new ClothesEntity();
        teniska.setBrand(armani).setClothesType(ClothesType.Shirt).setImageURL("dreshka.jpg")
                        .setPrice(12.40).setSize(Sizes.M);
        brandRepository.save(armani);
        clothesRepository.save(teniska);
      BrandEntity tommy = new BrandEntity();
      tommy.setBrand("Tommy Hilfiger").setImageURL("https://d2dzik4ii1e1u6.cloudfront.net/images/lexology/static/b472e0ca-e3e0-4d6a-9d4e-a69f120493f6.PNG");
      brandRepository.save(tommy);
      BrandEntity balenciaga = new BrandEntity();
      balenciaga.setBrand("Balenciaga").setImageURL("https://vectorseek.com/wp-content/uploads/2021/01/Balenciaga-Logo-Vector.jpg");
      brandRepository.save(balenciaga);





    }
}
