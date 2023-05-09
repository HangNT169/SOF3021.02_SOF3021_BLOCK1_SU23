package com.fpt.poly.sof3021.B1_OverviewSwing;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class B1_OverviewSwing {

    @GetMapping("/demo")
    public String demo() {
        return "/buoi1/home";
    }
}
