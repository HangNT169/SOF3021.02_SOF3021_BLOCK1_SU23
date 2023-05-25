package com.fpt.poly.sof3021.B8_JPA.controller;

import com.fpt.poly.sof3021.B8_JPA.entity.Category;
import com.fpt.poly.sof3021.B8_JPA.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/hienthi")
    public String hienThi(Model model){
        List<Category>categoryList = categoryService.getAll();
        model.addAttribute("danhSach",categoryList);

        return "/buoi8/theloai";
    }
}
