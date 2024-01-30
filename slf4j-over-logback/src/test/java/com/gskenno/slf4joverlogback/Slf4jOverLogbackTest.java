package com.gskenno.slf4joverlogback;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jOverLogbackTest {

    @Test
    public void test(){
        Logger log = LoggerFactory.getLogger(getClass());
        log.info("Slf4jOverLogbackTest-info");
        log.debug("Slf4jOverLogbackTest-debug");
    }
}
