package com.app.controller;/*
 *@Auther:wuqi
 *@Date:${date}
 *@Description:com.app
 *@version:1.0
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller()
public class LoginAction {

//    @Autowired
//    private Test test;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public void login(){
        System.out.println("logining.....");
//        test.print();
    }
}
