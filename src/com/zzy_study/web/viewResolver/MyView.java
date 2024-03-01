package com.zzy_study.web.viewResolver;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.AbstractView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Component(value = "myViewx")
public class MyView extends AbstractView {
    @Override
    protected void renderMergedOutputModel(Map<String, Object> map, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        //完成视图渲染 通过请求转发跳转到我们需要的界面
        System.out.println("进入到MyView");
        httpServletRequest.getRequestDispatcher("/WEB-INF/pages/my_view.jsp").forward(httpServletRequest,httpServletResponse);
    }
}
