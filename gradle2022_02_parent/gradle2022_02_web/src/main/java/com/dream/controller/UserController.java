package com.dream.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author : huzejun
 * @Date: 2022/4/27-2:58
 */
@Controller
@RequestMapping("/user")
public class UserController {
 /*   @Autowired
    private UserService userService;
*/
    @RequestMapping("/save")
    public String save(Model model){
//        String save = userService.save();
//        model.addAttribute("save",save);
        return "list";
    }
}
