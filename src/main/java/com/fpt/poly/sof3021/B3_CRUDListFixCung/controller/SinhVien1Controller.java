package com.fpt.poly.sof3021.B3_CRUDListFixCung.controller;

import com.fpt.poly.sof3021.B3_CRUDListFixCung.entity.SinhVien;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
// Tat ca cac ham / request
// => Co the tra ve bat cu kieu du lieu gi
public class SinhVien1Controller {

    @GetMapping("/demo12")
    public List<SinhVien> fakeData() {
        List<SinhVien> listSinhVien = new ArrayList<>();
        listSinhVien.add(new SinhVien("HE130461", "Nguyen Thuy Hang", 10, "Ha Noi", false));
        listSinhVien.add(new SinhVien("HE130462", "Nguyen Hoang Tien", 11, "Ha Noi1", true));
        listSinhVien.add(new SinhVien("HE130463", "Nguyen Anh Dung", 15, "Ha Noi3", true));
        listSinhVien.add(new SinhVien("HE130464", "Vu Van Nguyen", 14, "Ha Noi6", true));
        listSinhVien.add(new SinhVien("HE130465", "Tran Tuan Phong", 20, "Ha Noi7", true));
        return listSinhVien;
    }
}
