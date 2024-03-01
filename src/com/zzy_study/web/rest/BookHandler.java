package com.zzy_study.web.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/user")
@Controller
public class BookHandler {
    // @RequestMapping(value = "/book/{id}", method = RequestMethod.GET)
    // public String getBook(@PathVariable("id") String id){
    //     System.out.println("查询书籍 id =" +id);
    //     return "login_ok";
    // }
    @RequestMapping(value = "/book")
    public String addBook(String bookName){
        System.out.println("查询书籍 name =" +bookName);
        return "login_ok";
    }

    //删除[DELETE]
    @RequestMapping(value = "/book/{id}",method = RequestMethod.DELETE)
    public String delBook(@PathVariable("id") String id) {
        System.out.println("删除书籍 id= " + id);//return "success"; [如果 这样返 回会报错 JSPs only permit GET POST orHEAD]
        return "redirect:/user/success"; //重定向到一个没有指定 method 的 Handler 方法
    }
    //删除[DELETE]
    @RequestMapping(value = "/success")
    public String success() {
        System.out.println("success" );//return "success"; [如果 这样返 回会报错 JSPs only permit GET POST orHEAD]
        return "login_ok"; //重定向到一个没有指定 method 的 Handler 方法
    }
    //删除[put]
    @PutMapping(value = "/book/{id}")
    public String putBook(@PathVariable("id") String id) {
        System.out.println("删除书籍 id= " + id);//return "success"; [如果 这样返 回会报错 JSPs only permit GET POST orHEAD]
        return "redirect:/user/success"; //重定向到一个没有指定 method 的 Handler 方法
    }
}
