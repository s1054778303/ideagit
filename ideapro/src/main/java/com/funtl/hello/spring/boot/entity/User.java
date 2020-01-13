package com.funtl.hello.spring.boot.entity;

import java.io.Serializable;

/**
 * @Desc:
 * @Author:wzy
 * @CreateTime: 2020/1/6 0006 下午 14:03
 **/
public class User implements Serializable {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
