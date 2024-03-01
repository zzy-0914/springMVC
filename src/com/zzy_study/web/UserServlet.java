package com.zzy_study.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserServlet {
    @RequestMapping(value = "/login")
    public String  login(){
        System.out.println("loginOk");
        return "login_ok";
    }
}
