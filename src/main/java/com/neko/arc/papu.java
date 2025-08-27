package com.neko.arc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class papu {

    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping("/")
    public String papu() {
        System.out.println("appName: " + appName);
        return "index.html";
    }

}
