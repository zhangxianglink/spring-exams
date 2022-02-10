package com.example.demo.nacostest.service;

import com.example.demo.nacostest.beans.User;
import com.example.demo.nacostest.event.UserLogEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import javax.jws.Oneway;

/**
 * @author xiangzhang
 * @since 2022-02-10 12:19
 */
@Service
public class UserService {

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    ApplicationEventPublisher eventPublisher;

    public void showUser(User user){
        for (int i = 0; i < 100000; i++) {
            if ( i % 1000 == 0){
                System.out.println(i);
            }
        }
        applicationContext.publishEvent(new UserLogEvent(this,user));
//        eventPublisher.publishEvent();
    }

    public void userListener(User user) {
        System.out.println(user);
    }
}
