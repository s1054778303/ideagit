package com.funtl.hello.spring.boot.controller;

import com.funtl.hello.spring.boot.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Desc:
 * @Author:wzy
 * @CreateTime: 2020/1/6 0006 下午 13:58
 **/
@Controller
public class MainController {

    @GetMapping("/")
    public String index(Model model){
        User user=new User();
        user.setUsername("张三");
        model.addAttribute("user",user);
        return "index";
    }
}































