package com.gskeno.log4j;

import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Log4jTest {

    @Test
    public void test(){
        System.out.println(System.getProperty("user.dir"));
        Logger logger = Logger.getLogger(getClass());
        logger.info("Log4jTest-info");
        logger.debug("Log4jTest-debug");
        logger.warn("Log4jTest-warn");
    }

    @Test
    public void locateFile() throws IOException {
        // 这里不会将～作为系统目录
        File file = new File("${user.home}/logs/test.txt");
        System.out.println(file.exists());
        String absolutePath = file.getAbsolutePath();
        System.out.println(absolutePath);
        FileOutputStream fos = new FileOutputStream("~/logs/test.txt", true);
        fos.write(8);
        fos.close();
    }

}
