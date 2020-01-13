package com.funtl.hello.spring.boot.exception;

import com.sun.org.apache.bcel.internal.classfile.Code;
import lombok.Data;

/**
 * @Desc:
 * @Author:wzy
 * @CreateTime: 2020/1/9 0009 下午 20:29
 **/
@Data
public class MyException extends RuntimeException {
    private int errCode;
    private String errMsg;
    public MyException(int errCode,String errMsg){
        this.errCode=errCode;
        this.errMsg=errMsg;
    }

}

    
    
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    