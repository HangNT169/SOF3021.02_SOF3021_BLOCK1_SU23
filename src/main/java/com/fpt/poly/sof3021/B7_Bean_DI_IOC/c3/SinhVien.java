package com.fpt.poly.sof3021.B7_Bean_DI_IOC.c3;

public class SinhVien {

    private TrangPhuc1 trangPhuc1;

    public SinhVien(TrangPhuc1 trangPhuc1) {
        this.trangPhuc1 = trangPhuc1;
    }

    public void svMac(){
        trangPhuc1.wear();
    }
}
