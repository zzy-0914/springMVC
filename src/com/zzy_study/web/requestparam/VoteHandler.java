package com.zzy_study.web.requestparam;

import com.zzy_study.web.requestparam.entity.Master;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

@RequestMapping("/vote")
@Controller
public class VoteHandler {
//获取到超链接传递的数据
/**
 * 老韩解读 @RequestParam(value="name", required=false)
 * 1.@RequestParam : 表示说明一个接受到的参* 2.value="name" : 接收的参数名是 name
 * 3.required=false : 表示该参数可以有，也可以没有 ,如果 required=true,表示必须传递该
 参数. * 默认是 required=true
 */
@RequestMapping(value = "/vote01")
public String test01(@RequestParam(value = "name",required = false)
        String username) {
        System.out.println("得到的 username= " + username);
        //返回到一个结果
        return "success";
    }
    @RequestMapping(value = "/vote02")
    public String test02(@RequestHeader("Accept-Encoding") String ae) {
        System.out.println("得到的 Accept-Encoding= " + ae);
        //返回到一个结果
        return "success";
    }
    @RequestMapping(value = "/vote03")
    public String test03(Master master) {
        System.out.println("得到的 master= " + master);
        //返回到一个结果
        return "success";
    }
    //演示servlet api 的使用
    @RequestMapping(value = "/vote04")
    public String test04(HttpServletRequest request, HttpServletResponse response) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //返回到一个结果
        return "success";
    }
    //演示servlet api 的使用 会将数据模型 自动封装为java对象 并放到request域中
    @RequestMapping(value = "/vote05")
    public String test05(Master master) {

        //返回到一个结果
        return "success";
    }
    //springMvc会将数据模型 自动封装为java对象 并放到request域中(通过Map方式放入)
    @RequestMapping(value = "/vote06")
    public String test06(Master master, Map<String,Object> map) {
        map.put("master",null);
        //返回到一个结果
        return "success";
    }
    //springMvc会将数据模型 自动封装为java对象 并放到request域中(通过Map方式放入)
    @RequestMapping(value = "/vote07")
    public ModelAndView test07(Master master) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("master",null);
        modelAndView.setViewName("success");
        return modelAndView;
    }
    //演示如何用将数据放到session中
    @RequestMapping(value = "/vote08")
    public String test08(Master master, HttpSession httpSession) {
        httpSession.setAttribute("master",master);
        System.out.println(master);
        //返回到一个结果
        return "success";
    }
    @ModelAttribute
    public void  prepareModel(){
        System.out.println("prepareModel被调用");
    }
}