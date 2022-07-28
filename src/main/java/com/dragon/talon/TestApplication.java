package com.dragon.talon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @ClassName TestApplication
 * @Version 1.0
 * @Author dragon
 * @Date 2022/7/28 2:18 下午
 * @Description
 **/
@SpringBootApplication
@ServletComponentScan
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}
