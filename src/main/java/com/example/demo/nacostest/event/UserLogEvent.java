package com.example.demo.nacostest.event;

import com.example.demo.nacostest.beans.User;
import org.springframework.context.ApplicationEvent;

/**
 * @author xiangzhang
 * @since 2022-02-10 12:09
 * @description: The type User log event.
 */
public class UserLogEvent extends ApplicationEvent {

    public User getUser() {
        return user;
    }

    private final User user;

    public UserLogEvent(Object source, User user) {
        super(source);
        this.user = user;
    }


}
