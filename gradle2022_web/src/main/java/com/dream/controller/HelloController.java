package com.dream.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author : huzejun
 * @Date: 2022/4/27-2:14
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/list")
    public String toList(){
        return "list";
    }
}
