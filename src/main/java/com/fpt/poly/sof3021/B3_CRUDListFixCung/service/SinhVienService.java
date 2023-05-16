package com.fpt.poly.sof3021.B3_CRUDListFixCung.service;

import com.fpt.poly.sof3021.B3_CRUDListFixCung.entity.SinhVien;

import java.util.List;

public interface SinhVienService {

    List<SinhVien>getAll();

    void addSinhVien(SinhVien sinhVien);

    SinhVien detailSinhVien(String ma);

}
