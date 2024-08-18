package com.project.smartContactManager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    //user dashboard page

    @RequestMapping(value = "/dashboard")
    public String userDashboard(){
        System.out.println("User dashboard");
        return "user/dashboard";
    }

    //users add contacts page

    @RequestMapping(value = "/profile")
    public String userProfile(){
        System.out.println("User profile");
        return "user/profile";
    }

    //user view contacts

    //user edit contact

    //user delete contact

    //user search contact


}
