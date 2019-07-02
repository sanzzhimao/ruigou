package com.szm.controller;

import com.szm.pojo.User;
import com.szm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    private IUserService userService;
    @RequestMapping("/touser")
    public String toUser(){
        System.out.println("to user..");
        return "regist";
    }
    @RequestMapping("/regist")
    public String regist(User user, Model model){
        System.out.println("regist..");
        userService.regist(user);
        return "regist";
    }
    @RequestMapping("/find")
    public String find(int id, Model model){
        System.out.println("find..");
        System.out.println(id);
        User user=userService.findUser(id);
        System.out.println(user);
        return "regist";
    }
}
