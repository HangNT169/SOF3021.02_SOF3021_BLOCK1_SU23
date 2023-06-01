//package com.fpt.poly.sof3021.B8_JPA.controller;
//
//import com.fpt.poly.sof3021.B8_JPA.entity.Product;
//import com.fpt.poly.sof3021.B8_JPA.service.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import java.util.List;
//
//@Controller
//public class ProducController {
//    @Autowired
//    private ProductService productService;
//
//    @GetMapping("/product/hien-thi")
//    public String hienThi(Model model){
//        List<Product>products=productService.getAll();
//        model.addAttribute("products",products);
//        return "/buoi10/product";
//    }
//}
