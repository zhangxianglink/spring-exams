package com.example.demo.nacostest.listener;

import com.example.demo.nacostest.beans.User;
import com.example.demo.nacostest.event.UserLogEvent;
import com.example.demo.nacostest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author xiangzhang
 * @since 2022-02-10 12:15
 * @description: The type User listener.
 */
@Component
public class UserLogListener implements ApplicationListener<UserLogEvent> {

    private final UserService userService;

    @Autowired
    public UserLogListener(UserService userService){
        this.userService = userService;
    }

    @Override
    public void onApplicationEvent(UserLogEvent event) {
        System.out.println("--------------监听触发-------------------");
        final User user = event.getUser();
        userService.userListener(user);
    }
}
