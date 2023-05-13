package com.fpt.poly.sof3021.B3_CRUDListFixCung.service.impl;

import com.fpt.poly.sof3021.B3_CRUDListFixCung.entity.SinhVien;
import com.fpt.poly.sof3021.B3_CRUDListFixCung.service.SinhVienService;

import java.util.ArrayList;
import java.util.List;

public class SinhVienServiceImpl implements SinhVienService {

    private List<SinhVien> listSinhVien = new ArrayList<>();

    public SinhVienServiceImpl() {
        // add cac phan tu
        listSinhVien.add(new SinhVien("HE130461", "Nguyen Thuy Hang", 10, "Ha Noi", false));
        listSinhVien.add(new SinhVien("HE130462", "Nguyen Hoang Tien", 11, "Ha Noi1", true));
        listSinhVien.add(new SinhVien("HE130463", "Nguyen Anh Dung", 15, "Ha Noi3", true));
        listSinhVien.add(new SinhVien("HE130464", "Vu Van Nguyen", 14, "Ha Noi6", true));
        listSinhVien.add(new SinhVien("HE130465", "Tran Tuan Phong", 20, "Ha Noi7", true));

    }

    @Override
    public List<SinhVien> getAll() {
        return listSinhVien;
    }

}
