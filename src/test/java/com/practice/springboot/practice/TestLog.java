package com.practice.springboot.practice;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestLog {
    private static final Logger logger = LoggerFactory.getLogger(TestLog.class);

    @Test
    public void test() {
        logger.trace("trace level");
        logger.debug("debug level");
        logger.warn("warn level");
        logger.info("info level");
        logger.error("error level");
    }
}
