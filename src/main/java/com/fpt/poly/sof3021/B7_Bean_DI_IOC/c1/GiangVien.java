package com.fpt.poly.sof3021.B7_Bean_DI_IOC.c1;

public class GiangVien {

    private TrangPhuc trangPhuc = new TrangPhuc();

    public void giangVienMac(){
        trangPhuc.wear();
    }
}
