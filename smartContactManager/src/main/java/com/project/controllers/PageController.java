package com.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/home")
    public String home(){
        System.out.println("Home page handler");
        return "Home";
    }

    @RequestMapping("about")
    public String aboutPage(){
        System.out.println("About page loading");
        return "about";
    }

    @RequestMapping("/services")
    public String servicesPage() {
        System.out.println("services page loading");
        return "services";
    }

    
}
