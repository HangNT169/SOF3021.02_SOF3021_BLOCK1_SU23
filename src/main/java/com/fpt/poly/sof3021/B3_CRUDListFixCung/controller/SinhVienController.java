package com.fpt.poly.sof3021.B3_CRUDListFixCung.controller;

import com.fpt.poly.sof3021.B3_CRUDListFixCung.entity.SinhVien;
import com.fpt.poly.sof3021.B3_CRUDListFixCung.service.SinhVienService;
import com.fpt.poly.sof3021.B3_CRUDListFixCung.service.impl.SinhVienServiceImpl;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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

    // C1: Form HTML
//    @GetMapping("/sinh-vien/view-add")
//    public String viewAddSinhVien() {
//        return "/buoi3/add-sinh-vien";
//    }
//
//    @PostMapping("/sinh-vien/add")
//    public String addSinhVien(@RequestParam("mssv") String ma, @RequestParam("ten") String ten,
//                              @RequestParam("tuoi") String tuoi, @RequestParam("diaChi") String diaChi,
//                              @RequestParam("gioiTinh") String gt, Model model) {
//        // B1: Tao ra doi tuong Object
////        SinhVien sinhVien = new SinhVien(ma, ten, Integer.valueOf(tuoi), diaChi, Boolean.valueOf(gioiTinh));
//        SinhVien sinhVien = SinhVien.builder()
//                .gioiTinh(Boolean.valueOf(gt))
//                .mssv(ma)
//                .ten(ten)
//                .tuoi(Integer.valueOf(tuoi))
//                .diaChi(diaChi)
//                .build(); //<=> Contructor khong tham so
//        // B2: Ham add trong service
//        sinhVienService.addSinhVien(sinhVien);
//        // B3: Quay ve trang chu
//        // C1:
////        sinhViens = sinhVienService.getAll();
////        model.addAttribute("listSinhVien", sinhViens);
////        return "/buoi3/sinhviens";
//        // C2: redirect => Quay ve trang hien thi
//        return "redirect:/sinh-vien/hien-thi";
//    }
    // C2: Spring From
    @GetMapping("/sinh-vien/view-add")
    public String viewAdd(Model model) {
        model.addAttribute("sv", new SinhVien());
        return "/buoi5/add-sinh-vien";
    }

    @PostMapping("/sinh-vien/add")
    public String addSinhVien(@Valid @ModelAttribute("sv") SinhVien sinhVien, BindingResult result) {
        if (result.hasErrors()) {
            return "/buoi5/add-sinh-vien";
        }
        sinhVienService.addSinhVien(sinhVien);
        return "redirect:/sinh-vien/hien-thi";
    }

    @GetMapping("/sinh-vien/detail/{maSV}")
    public String detailSinhVien(@PathVariable("maSV") String ma, Model model) {
        SinhVien sinhVien = sinhVienService.detailSinhVien(ma);
        model.addAttribute("sv", sinhVien);
        return "/buoi3/detail-sinh-vien";
    }

    @GetMapping("/sinh-vien/view-update/{maSV}")
    public String viewUpdate(@PathVariable("maSV") String ma, Model model) {
        SinhVien sinhVien = sinhVienService.detailSinhVien(ma);
        model.addAttribute("sv", sinhVien);
        return "/buoi3/update-sinh-vien";
    }

    @GetMapping("delete/{ma}")
    public String deleteSinhVien(@PathVariable("ma") String ma) {
        sinhVienService.deleteSinhVien(ma);
        return "redirect:/sinh-vien/hien-thi";
    }
//    @GetMapping("/demo11")
//    @ResponseBody // nhan danh dau => Day la API => Json
//    public List<SinhVien> fakeData() {
//        List<SinhVien> listSinhVien = new ArrayList<>();
//        listSinhVien.add(new SinhVien("HE130461", "Nguyen Thuy Hang", 10, "Ha Noi", false));
//        listSinhVien.add(new SinhVien("HE130462", "Nguyen Hoang Tien", 11, "Ha Noi1", true));
//        listSinhVien.add(new SinhVien("HE130463", "Nguyen Anh Dung", 15, "Ha Noi3", true));
//        listSinhVien.add(new SinhVien("HE130464", "Vu Van Nguyen", 14, "Ha Noi6", true));
//        listSinhVien.add(new SinhVien("HE130465", "Tran Tuan Phong", 20, "Ha Noi7", true));
//        return listSinhVien;
//    }
}
