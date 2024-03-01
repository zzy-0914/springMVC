package com.zzy_study.web.viewResolver;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/goods")
@Controller
public class GoodsHandler {
    @RequestMapping("/buy")
    public String buyGoods(){
        return "redirect:/WEB-INF/pages/my_view.jsp";
    }
}
