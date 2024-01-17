package com.example.bookstore.controller;

import com.example.bookstore.model.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;

public class AdminInterceptor implements HandlerInterceptor {
//    @Override
//    public boolean preHandle(HttpServletRequest request , HttpServletResponse
//            response, Object handler) throws Exception {
//        System.out.println(request.getRequestURI());
//        User user = (User) request.getSession().getAttribute( "user");
//        if (user == null && !request.getRequestURI().equals( "/login_admin")) {
//            System. out.println("admin is null" );
//            response.sendRedirect( "/login");
//            return false;
//        }
//        return true;
//    }
}
