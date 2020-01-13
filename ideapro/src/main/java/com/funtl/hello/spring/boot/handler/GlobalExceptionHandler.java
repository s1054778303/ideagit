package com.funtl.hello.spring.boot.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Desc:统一异常处理
 * @Author:wzy
 * @CreateTime: 2020/1/9 0009 下午 20:21
 **/
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 通用异常
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Object err(Exception e){
        return e.getMessage();
    }

}


    
    
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    