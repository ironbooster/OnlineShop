package com.example.drehimagazin.repository.entities;

import com.example.drehimagazin.repository.enums.ClothType;
import com.example.drehimagazin.repository.enums.Sizes;

import javax.persistence.*;

@Entity
@Table(name="clothes")
public class ClothEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private ClothType clothType;
    @Enumerated(EnumType.STRING)
    private Sizes size;
    private double price;
    private String imageURL;

    @ManyToOne
    private BrandEntity brand;


    public ClothType getClothType() {
        return clothType;
    }

    public ClothEntity setClothType(ClothType clothType) {
        this.clothType = clothType;
        return this;
    }

    public ClothEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public ClothEntity setSize(Sizes size) {
        this.size = size;
        return this;
    }

    public ClothEntity setPrice(double price) {
        this.price = price;
        return this;
    }

    public ClothEntity setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }

    public ClothEntity setBrand(BrandEntity brand) {
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
