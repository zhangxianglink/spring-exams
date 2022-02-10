package com.example.demo.nacostest.init;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author xiangzhang
 * @since 2022-02-10 15:38
 */
@Component
public class ApplicationRunnerExample implements ApplicationRunner {

    public static final Logger log = LoggerFactory.getLogger(ApplicationRunnerExample.class);

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("获取项目启动-XX参数：{}",args.getOptionNames());
    }
}
