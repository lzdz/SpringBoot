package com.atguigu.springboot.exception;

/**
 * @author 刘振东
 * @create 2021-10-26 18:37
 */
public class UserNotExistException extends RuntimeException {

    public UserNotExistException() {
        super("用户不存在");
    }
}

