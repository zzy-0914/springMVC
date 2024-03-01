package com.zzy_study.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/computer")
@Controller
public class ComputerHandler {
    @PostMapping("/info")
    public String info(String brand,String price,String nums){
        System.out.println("brand="+brand+"price="+price+"mums="+nums);
        return "login_ok";
    }
}
