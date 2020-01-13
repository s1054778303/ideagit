package com.funtl.hello.spring.boot.controller;


import com.funtl.hello.spring.boot.entity.TbUser;
import com.funtl.hello.spring.boot.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yuan
 * @since 2020-01-06
 */
@RestController
public class TbUserController {
    @Autowired
    private TestService testService;


    /**
     * 根据ID获取用户信息
     */
    @GetMapping("/{id}")
    public TbUser getUser(@PathVariable int id){
        return testService.getUser(id);
    }

    /**
     * 更新
     */
    @GetMapping("/update")
    public String updateUser(){
        testService.updateUser();
        return "ok";
    }

    /**
     * 查询
     */
    @GetMapping("/getAll")
    public List getAll(){
        return testService.getAll();
    }
}



























