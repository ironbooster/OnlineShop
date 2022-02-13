package com.example.drehimagazin.service.impl;

import com.example.drehimagazin.repository.BrandRepository;
import com.example.drehimagazin.service.BrandService;
import com.example.drehimagazin.web.model.entities.BrandEntity;
import com.example.drehimagazin.web.model.view.BrandViewModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BrandServiceImpl implements BrandService {

    private BrandRepository brandRepository;

    public BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<BrandViewModel> getAllBrands() {
        List<BrandViewModel> brandViewModels = new ArrayList<>();
        List<BrandEntity> allBrands = brandRepository.findAll();
        allBrands.forEach(me ->{
            //TODO
        });
        return brandViewModels;
    }
}
