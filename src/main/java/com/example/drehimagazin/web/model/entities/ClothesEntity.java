package com.example.drehimagazin.web.model.entities;

import com.example.drehimagazin.repository.enums.ClothesType;
import com.example.drehimagazin.repository.enums.Sizes;

import javax.persistence.*;

@Entity
@Table(name="clothes")
public class ClothesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private ClothesType clothesType;
    @Enumerated(EnumType.STRING)
    private Sizes size;
    private double price;
    private String imageURL;

    @ManyToOne
    private BrandEntity brand;


    public ClothesType getClothesType() {
        return clothesType;
    }

    public ClothesEntity setClothesType(ClothesType clothesType) {
        this.clothesType = clothesType;
        return this;
    }

    public ClothesEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public ClothesEntity setSize(Sizes size) {
        this.size = size;
        return this;
    }

    public ClothesEntity setPrice(double price) {
        this.price = price;
        return this;
    }

    public ClothesEntity setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }

    public ClothesEntity setBrand(BrandEntity brand) {
        this.brand = brand;
        return this;
    }

    public Long getId() {
        return id;
    }

    public Sizes getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getImageURL() {
        return imageURL;
    }

    public BrandEntity getBrand() {
        return brand;
    }
}
