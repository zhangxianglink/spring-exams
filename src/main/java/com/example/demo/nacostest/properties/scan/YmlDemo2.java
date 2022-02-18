package com.example.demo.nacostest.properties.scan;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author xiangzhang
 * @since 2022-02-18 12:22
 * @date 当多个配置类时可以采用 @ConfigurationPropertiesScan + @ConfigurationProperties注解组合的方式
 */
@ConfigurationProperties(prefix = "mglbox.config")
@Getter
@Setter
@ToString
public class YmlDemo2 {

    private String appId;
    private String appSecret;
}
