package com.zzy_study.web.dataValid;

import com.zzy_study.web.dataValid.entity.Monster;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;


@Controller
@Scope(value = "prototype")
public class MonsterHandler {
        //显示添加 monster 的界面
        @RequestMapping(value = "/addMonsterUI")
        public String addMonsterUI(Map<String, Object> map) {
            /**老韩解读:
             1. 这里的表单，我们使用 springMVC 的标签来完成
             2. SpringMVC 表单标签在显示之前必须在 request 中有一个 bean, 该 bean
             的属性和表单标签的字段要对应!
             request 中的 key 为: form 标签的 modelAttrite 属性值， 比如这里的
             monsters
             3. SpringMVC 的 form:form 标签的 action 属性值中的 / 不代表 WEB 应用
             的根目录. 4. <form:form action="monster" method="POST" modelAttribute="monster">
             // 这 里 需 要 给 request 增 加 一 个 monster ， 因 为 jsp 页 面 的
             modelAttribute="monster"需要
             //这时是 springMVC 的内部的检测机制 即使是一个空的也需要，否则报错
             */

             map.put("monster", new Monster());
             return "datavalid/monster_addUI";
        }
    @RequestMapping("/save")
    public String test(Monster monster){
            System.out.println(monster);
            return "datavalid/success";
        }
}
