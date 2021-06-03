package com.paulius.security.securingweb;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    //setting up view controller to expose templates(login,hello,home.html..)

    //using already existing addViewController to add four view controllers
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");

        registry.addViewController("/hello").setViewName("hello");
        registry.addViewController("/login").setViewName("login");
    }

}
