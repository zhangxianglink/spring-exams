package com.example.demo.nacostest.init;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author xiangzhang
 * @since 2022-02-10 15:26
 */

@Component
public class CommandLineRunnerExample implements CommandLineRunner {

    public static final Logger log = LoggerFactory.getLogger(CommandLineRunnerExample.class);

    @Override
    public void run(String... args) throws Exception {
        log.info("输出Application方法里面的 string[] args: {}",args);
    }
}
