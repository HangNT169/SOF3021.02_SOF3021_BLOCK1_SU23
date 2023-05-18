package com.fpt.poly.sof3021.B3_CRUDListFixCung.entity;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor // contructor khong tham so
@AllArgsConstructor // contructor all tham so
@Getter
@Setter
@ToString
@Builder // Tao ra 1 contructor voi so tham so tuy y. Truyen vao 1 tham so => Tu hieu la contructor co 1 tham so...
// Khi dung builder thu tu tham so truyen vao khong bi anh huong
public class SinhVien {

    @NotEmpty(message = "MSSV trong day. Nhap di hihi")
    @Size(min = 5)
    private String mssv;

    @Pattern(regexp = "[a-z A-Z]+")
    private String ten;

    @NotNull
    @Min(value = 20)
    private Integer tuoi;

    private String diaChi;

    private Boolean gioiTinh;

    // @Data <=>  import *
    // Ctrl Alt O  => Xoa file import thua
}
