package com.dragon.talon.filter;

import com.dragon.talon.utils.TraceUtils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @ClassName MyFilter
 * @Version 1.0
 * @Author dragon
 * @Date 2022/7/28 2:50 下午
 * @Description
 **/
@WebFilter(filterName = "myFilter", urlPatterns = {"/*"})
public class MyFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        try {
            final String trace = TraceUtils.getTrace();
            System.out.println(Thread.currentThread().getName() + " http tracae " + trace);
            filterChain.doFilter(servletRequest, servletResponse);
        } finally {
            TraceUtils.remove();
        }
    }
}
