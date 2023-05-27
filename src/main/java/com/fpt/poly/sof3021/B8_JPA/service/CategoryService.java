package com.fpt.poly.sof3021.B8_JPA.service;

import com.fpt.poly.sof3021.B8_JPA.entity.Category;
import org.springframework.data.domain.Page;

import java.util.List;

public interface CategoryService {

    List<Category> getAll();

    Page<Category> phanTrang(Integer pageNo, Integer size);

}
