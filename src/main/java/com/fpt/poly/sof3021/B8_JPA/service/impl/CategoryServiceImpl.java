package com.fpt.poly.sof3021.B8_JPA.service.impl;

import com.fpt.poly.sof3021.B8_JPA.entity.Category;
import com.fpt.poly.sof3021.B8_JPA.repository.CategoryRepository;
import com.fpt.poly.sof3021.B8_JPA.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Page<Category> phanTrang(Integer pageNo, Integer size) {
        Pageable pageable = PageRequest.of(pageNo, size);
        return categoryRepository.findAll(pageable);
    }

}
