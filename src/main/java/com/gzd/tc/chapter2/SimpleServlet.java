package com.gzd.tc.chapter2;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author gzd
 * @date 2018/1/17 14:02
 * @desc 一个简单的servlet,注意,每一个servlet容器都是在前一章
 * 的应用逐渐演变过来的,直至一个完全功能的tomcat servlet容器在
 * 第17章被建立起来
 */
public class SimpleServlet implements Servlet {


    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("servlet init ...");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("from service");
        PrintWriter out = servletResponse.getWriter();
        out.print("hello, this is kopshome");
        out.print("kopshome is good");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("destroy ...");
    }
}
