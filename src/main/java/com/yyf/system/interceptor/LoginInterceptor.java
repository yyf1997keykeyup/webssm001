package com.yyf.system.interceptor;

import com.yyf.system.pojo.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Feng on 2017/6/3.
 */

/**
 * 登录认证的拦截器
 */
public class LoginInterceptor implements HandlerInterceptor{

    /**
     * Handler执行完成之后调用的方法
     */
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
                                Object handler,Exception exc) throws Exception{

    }

    /**
     * Handler执行之后，ModelAndView返回之前调用这个方法
     */
    public void postHandle(HttpServletRequest request, HttpServletResponse response,
                           Object handler, ModelAndView modelAndView) throws Exception {
    }

    /**
     * Handler执行之前调用这个方法
     */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception {
        //获取请求的URL
        String url = request.getRequestURI();
        //URL:login.jsp是公开的;这个demo是除了login.jsp是可以公开访问的，其它的URL都进行拦截控制
        //yanyufeng:后期中，“名师介绍”和“发消息给我们”也公开
        if(url.indexOf("/login.action")>=0||url.indexOf("toLogin.action")>=0||url.indexOf("toTeacher.action")>=0
                ||url.indexOf("sendMessage.action")>=0||url.indexOf("toHome.action")>=0){
            return true;
        }
        //获取Session
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        if(user != null){
            return true;
        }
            response.sendRedirect("/toLogin.action");

        return false;
    }

}
