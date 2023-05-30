package com.fpt.poly.sof3021.B8_JPA.service.impl;

import com.fpt.poly.sof3021.B8_JPA.entity.Product;
import com.fpt.poly.sof3021.B8_JPA.repository.Productrepository;
import com.fpt.poly.sof3021.B8_JPA.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private Productrepository productrepository;

    @Override
    public List<Product> getAll() {
        return productrepository.findAll();
    }
}
