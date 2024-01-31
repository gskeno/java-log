package com.gskeno.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class Log4j2Test {

    @Test
    public void Log4j2DefaultTest(){
        Logger logger = LogManager.getLogger(getClass());
        logger.debug("Log4j2DefaultTest-debug");
        logger.info("Log4j2DefaultTest-info");
        logger.warn("Log4j2DefaultTest-warn");
        logger.error("Log4j2DefaultTest-error"); // 默认级别error
    }
}
