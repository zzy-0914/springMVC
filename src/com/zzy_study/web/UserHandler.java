package com.zzy_study.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @RequestMapping(value = "/user") 这里加上了这个注解意味着
 */
@RequestMapping(value = "/user")
@Controller
public class UserHandler {
    //method = RequestMethod.POST 表示请求的必须是post方法
    @RequestMapping(value = "/buy",method = RequestMethod.POST)
    public String  login(){
        System.out.println("loginOk");
        return "success";
    }

    //占位符演示
    @RequestMapping(value = "/f/{username}/{userId}")
    public String  get(@PathVariable("username")String username,@PathVariable("userId")String userId){
        System.out.println("username = "+username+"userId = "+userId);
        return "login_ok";
    }
    @RequestMapping(value = "/find", params = "bookId=100", method =
            RequestMethod.GET)
    public String search(String bookId) {
        System.out.println("查询书籍 bookId= " + bookId);
        return "login_ok";
    }
    @RequestMapping(value = "/find1")
    public String search1(String bookId) {
        System.out.println("查询书籍 bookId= " + bookId);
        return "login_ok";
    }
    @RequestMapping(value = "/f1/{username}/{userId}")
    public String  f1(@PathVariable("username")String username,@PathVariable("userId")String userId){
        System.out.println("username = "+username+"userId = "+userId);
        return "login_ok";
    }
}
