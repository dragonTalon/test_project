package com.dragon.talon.control;

import com.dragon.talon.utils.TraceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Version 1.0
 * @Author dragon
 * @Date 2022/7/28 2:54 下午
 * @Description
 **/

@RestController
public class TestController {
    @RequestMapping("/test")
    public String test() {
        System.out.println(Thread.currentThread().toString() + TraceUtils.getTrace());
        return TraceUtils.getTrace();
    }
}
