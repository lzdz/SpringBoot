package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

/**
 * @author 刘振东
 * @create 2021-10-17 11:07
 */
@Controller
public class HelloController {

//    @RequestMapping({"/","/index.html"})
//    public String index(){
//        return "index";
//    }
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }


    //查出一些数据，在页面展示
    //查出用户数据，在页面展示
    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put ("hello","你好");
        //classpath:/templates/success.html
        map.put ("hello","<h1>你好</h1>");
        map.put ("users", Arrays.asList ("zhangsan","lisi","wangwu") );
        return  "success";
    }


}
