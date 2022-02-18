package com.example.demo.nacostest.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiang.z
 * @since 2021-05-24 11:55
 */
@Configuration
@PropertySource("classpath:black.properties")
@ConfigurationProperties(prefix = "black")
@Data
public class BlackListConfig {

    private List<String> list = new ArrayList<>();

}
