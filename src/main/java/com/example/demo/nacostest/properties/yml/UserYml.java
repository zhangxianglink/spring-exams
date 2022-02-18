package com.example.demo.nacostest.properties.yml;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.support.DefaultPropertySourceFactory;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author xiangzhang
 * @since 2022-02-18 17:07
 */
@Configuration
@PropertySource(value = "classpath:user.yml", factory = CommonPropertyResourceFactory.class )
@ConfigurationProperties(prefix = "user")
@Data
public class UserYml {
    private String userName;
    private boolean isAdmin;
    private Date regTime;
    private Long isOnline;
    private Map<String,Object> maps;
    private List<Object> lists;
    private Address address;

}

@Data
class Address {
    private String tel;
    private String city;
}
