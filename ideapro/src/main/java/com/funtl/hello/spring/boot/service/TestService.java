package com.funtl.hello.spring.boot.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.funtl.hello.spring.boot.entity.TbUser;
import com.funtl.hello.spring.boot.mapper.TbUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc:
 * @Author:wzy
 * @CreateTime: 2020/1/6 0006 下午 14:56
 **/
@Service
public class TestService {

    @Autowired
    private TbUserMapper userMapper;


    /**
     * 根据ID查找用户
     */
    public TbUser getUser(int id){
        TbUser tbUser = userMapper.selectById(id);
        return tbUser;
    }

    /**
     * 修改
     */
    public void updateUser() {
       TbUser tbUser=new TbUser();
       tbUser.setId(1);
       tbUser.setUName("张三2222");
       tbUser.insertOrUpdate();

    }

    /**
     * 条件查询
     * @return
     */
    public List getAll() {
        List<TbUser> users=new ArrayList<>();

        QueryWrapper queryWrapper=new QueryWrapper();
        queryWrapper.gt("age", 10);
        List<TbUser> list = userMapper.selectList(queryWrapper);

        return list;
    }
}























