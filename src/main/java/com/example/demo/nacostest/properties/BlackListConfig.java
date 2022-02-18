package com.example.demo.nacostest.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.support.DefaultPropertySourceFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiang.z
 * @since 2021-05-24 11:55
 */
@Configuration
@PropertySource(value = "classpath:black.properties", factory = DefaultPropertySourceFactory.class )
@ConfigurationProperties(prefix = "black")
@Data
public class BlackListConfig {

    private List<String> list;

}
