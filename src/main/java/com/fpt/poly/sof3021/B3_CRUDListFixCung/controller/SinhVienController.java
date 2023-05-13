package com.fpt.poly.sof3021.B3_CRUDListFixCung.controller;

import com.fpt.poly.sof3021.B3_CRUDListFixCung.entity.SinhVien;
import com.fpt.poly.sof3021.B3_CRUDListFixCung.service.SinhVienService;
import com.fpt.poly.sof3021.B3_CRUDListFixCung.service.impl.SinhVienServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SinhVienController {
    // @Controller => MVC(MODEL-VIEW-CONTROLLER)
    // Tat ca cac ham trong controller => LUON LUON TRA VE 1 VIEW
    // => LUON LUON RETURN 1 STRING

    private SinhVienService sinhVienService = new SinhVienServiceImpl();
    // interface = new class
    private List<SinhVien> sinhViens = new ArrayList<>();

    @GetMapping("/sinh-vien/hien-thi")
    public String hienThiDanhSachSinhVien(Model model) {
        sinhViens = sinhVienService.getAll();
        model.addAttribute("listSinhVien", sinhViens);
        return "/buoi3/sinhviens";
    }
}
