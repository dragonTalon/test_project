package com.dragon.talon.utils;

import com.alibaba.ttl.TransmittableThreadLocal;

import java.util.UUID;

/**
 * @ClassName TraceUtils
 * @Version 1.0
 * @Author dragon
 * @Date 2022/7/28 2:51 下午
 * @Description
 **/
public class TraceUtils {
    private static TransmittableThreadLocal<String> TRACES = new TransmittableThreadLocal<>();

    public static String getTrace() {
        String t = TRACES.get();
        if (null == t) {
            t = UUID.randomUUID().toString();
            TRACES.set(t);
        }
        return t;
    }

    public static void remove() {
        TRACES.remove();
    }

}
