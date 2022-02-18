package com.example.demo.nacostest.properties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author xiangzhang
 * @since 2022-02-18 12:22
 */
@Configuration
@ConfigurationProperties(prefix = "mglbox.config")
@Getter
@Setter
@ToString
public class YmlDemo {

    private String appId;
    private String appSecret;
}
