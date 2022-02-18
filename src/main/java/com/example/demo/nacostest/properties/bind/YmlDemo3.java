package com.example.demo.nacostest.properties.bind;

import lombok.Getter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

/**
 * @author xiangzhang
 * @since 2022-02-18 12:22
 * @since  @EnableConfigurationProperties(YmlDemo3.class)  @ConstructorBinding 配合
 */
@ConfigurationProperties(prefix = "mglbox.config")
@ConstructorBinding
@Getter
@ToString
public class YmlDemo3 {

    public YmlDemo3(String appId, String appSecret){
        this.appId = appId;
        this.appSecret = appSecret;
    }

    private final String appId;
    private final String appSecret;

}
