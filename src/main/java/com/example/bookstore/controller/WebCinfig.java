package com.example.bookstore.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebCinfig implements WebMvcConfigurer {
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new UserInterceptor()).addPathPatterns("/user");
//        registry.addInterceptor(new AdminInterceptor()).addPathPatterns("/admin");
//    }
}
