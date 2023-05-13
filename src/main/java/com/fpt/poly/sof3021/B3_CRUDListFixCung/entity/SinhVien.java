package com.fpt.poly.sof3021.B3_CRUDListFixCung.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor // contructor khong tham so
@AllArgsConstructor // contructor all tham so
@Getter
@Setter
@ToString
public class SinhVien {

    private String mssv;

    private String ten;

    private Integer tuoi;

    private String diaChi;

    private Boolean gioiTinh;

    // @Data <=>  import *
    // Ctrl Alt O  => Xoa file import thua
}
