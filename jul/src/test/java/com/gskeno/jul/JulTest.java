package com.gskeno.jul;

import org.junit.Test;

import java.util.logging.Logger;

public class JulTest {

    @Test
    public void test(){
        Logger logger = Logger.getLogger(getClass().getName());
        logger.info("JULTest");
    }
}
