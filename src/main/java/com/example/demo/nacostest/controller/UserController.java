package com.example.demo.nacostest.controller;

import com.example.demo.nacostest.beans.User;
import com.example.demo.nacostest.properties.BlackListConfig;
import com.example.demo.nacostest.properties.YmlDemo;
import com.example.demo.nacostest.properties.bind.YmlDemo3;
import com.example.demo.nacostest.properties.scan.YmlDemo2;
import com.example.demo.nacostest.properties.yml.UserYml;
import com.example.demo.nacostest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiangzhang
 * @since 2022-02-10 13:39
 */
@RestController
@RequestMapping(value = "/api/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public String userListener(){
        final User user = new User();
        user.setAge("12");
        user.setMagic("42");
        user.setName("jack");
        userService.showUser(user);
        return "ok";
    }

    @Autowired
    YmlDemo ymlDemo;

    @Autowired
    YmlDemo2 ymlDemo2;


    @Autowired
    YmlDemo3 ymlDemo3;

    @Autowired
    BlackListConfig blackListConfig;

    @Autowired
    UserYml userYml;

    @GetMapping("/properties")
    public void properties(){
        System.out.println(ymlDemo.toString());
        System.out.println(ymlDemo2.toString());
        System.out.println(ymlDemo3.toString());
        System.out.println(blackListConfig.toString());
        System.out.println(userYml.toString());
    }

}
