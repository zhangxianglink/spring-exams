package com.example.demo.nacostest;

import com.example.demo.nacostest.properties.bind.YmlDemo3;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(YmlDemo3.class)
@ConfigurationPropertiesScan("com.example.demo.nacostest.properties.scan")
public class NacosTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(NacosTestApplication.class, args);
	}

}
