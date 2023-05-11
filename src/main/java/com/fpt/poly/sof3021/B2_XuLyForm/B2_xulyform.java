package com.fpt.poly.sof3021.B2_XuLyForm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class B2_xulyform {

    @GetMapping("/login")
    public String lesson2(){
        return "/buoi2/b2";
    }

    @PostMapping("/ket-qua")
    public String ketQua(@RequestParam("uname") String name,
                         @RequestParam("psw")String password, Model model){
        // Lay gia tri tu view ve phia controller
        // J4: request.getParameter("ten cua o input")
        // J5: @RequestParam
        model.addAttribute("tk",name);
        model.addAttribute("mk",password);
        return "";
    }
}
