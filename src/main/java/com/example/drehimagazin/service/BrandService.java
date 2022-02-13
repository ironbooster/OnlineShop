package com.example.drehimagazin.service;

import com.example.drehimagazin.web.model.view.BrandViewModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BrandService {
    List<BrandViewModel> getAllBrands();
}
