package com.zzy_study.web.homework;

import com.zzy_study.web.UserHandler;
import com.zzy_study.web.homework.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/zzy")
@Controller
public class MyUserHandler {
    @RequestMapping("/login")
    public String login(User user){
        if ("hsp".equals(user.getUsername())&&"123".equals(user.getPassword())){
            System.out.println("登录成功");
            return "login_ok";
        } else {
            System.out.println("登录失败");
            return "login_error";
        }
    }
}
