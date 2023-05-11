package com.fpt.poly.sof3021.B1_OverviewSwing;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
// Co the danh dau 1 class/ bean trong Spring Boot bang bat cu annotation nao
// Neu đánh dấu bằng @Controller => Tầng này là tầng controller dùng để trao đổi giữa client & server
public class B1_HelloController {

    // Client & server giao tiep thong qua HTTP Method
    // Co 4 loai HTTP Method co ban :
    // GET   <=>   READ
    // POST  <=>   CREATE
    // PUT   <=>   UPDATE
    // DELETE  <=> DELETE
    // Java 5: Chi hoc GET (Hien Thi, Lay ) du lieu , POST ( Xu ly du lieu )
    // Khi su dung @Controller mo hinh lam MVC(MODEL - VIEW - CONTROLLER)
    // => Tat ca cac request Controller => LUON LUON TRA VE 1 VIEW (RETURN 1 VIEW ) : RETURN 1 STRING
    @GetMapping("/demo")
//    @RequestMapping(value = "/demo",method = RequestMethod.POST)
    // Default cua requestMapping => La Method GET
    public String hienThiGiaoDien(Model model){
        // Muon Truyen Gia tri tu controller sang View (JSP/Thymealef):
        // Java 4: request.setAttribute(tham so x1, tham so 2)
        // Java 5: Model
        model.addAttribute("hoVaTen","HangNT169");
        return "buoi1";
    }

}
