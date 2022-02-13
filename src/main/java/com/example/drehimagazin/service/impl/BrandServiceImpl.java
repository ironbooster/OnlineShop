package com.example.drehimagazin.service.impl;

import com.example.drehimagazin.repository.BrandRepository;
import com.example.drehimagazin.service.BrandService;
import com.example.drehimagazin.web.model.entities.BrandEntity;
import com.example.drehimagazin.web.model.view.BrandViewModel;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BrandServiceImpl implements BrandService {

    private BrandRepository brandRepository;
    private ModelMapper modelMapper;

    public BrandServiceImpl(BrandRepository brandRepository,ModelMapper modelMapper) {
        this.brandRepository = brandRepository;
        this.modelMapper =modelMapper;
    }

    @Override
    public List<BrandViewModel> getAllBrands() {
        List<BrandViewModel> brandViewModels = new ArrayList<>();
        List<BrandEntity> allBrands = brandRepository.findAll();
        allBrands.forEach(be ->{
            String brandName =  be.getBrand();

           // Optional<BrandViewModel> brandViewModelOpt = find(brandViewModels);
                BrandViewModel newBrandViewModel = new BrandViewModel();
                modelMapper.map(be,newBrandViewModel);
                brandViewModels.add(newBrandViewModel);



        });
        return brandViewModels;
    }

//    private static Optional<BrandViewModel> find(List<BrandViewModel> allBrands){
//        return allBrands.stream().findAny();
//   }
// private static Optional<BrandViewModel> findByName(List<BrandViewModel> allBrands, String name){
//        return allBrands.stream().filter(b->b.getName().equals(name)).findAny();
//    }

}
