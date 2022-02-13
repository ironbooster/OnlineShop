package com.example.drehimagazin.web.model.entities;

import javax.persistence.*;

@Entity
@Table(name="brands")
public class BrandEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String brand;
    private String imageURL;


    public BrandEntity setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }

    public String getImageURL() {
        return imageURL;
    }

    public BrandEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public BrandEntity setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public Long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }
}
