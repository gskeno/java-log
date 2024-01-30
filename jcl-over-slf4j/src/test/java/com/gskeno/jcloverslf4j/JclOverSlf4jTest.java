package com.gskeno.jcloverslf4j;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

public class JclOverSlf4jTest {

    @Test
    public void test(){
        Log log = LogFactory.getLog(getClass());
        log.info("JclOverSlf4jTest");
    }
}
