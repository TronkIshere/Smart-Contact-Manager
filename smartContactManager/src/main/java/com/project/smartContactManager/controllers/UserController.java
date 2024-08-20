package com.project.smartContactManager.controllers;

import com.project.smartContactManager.helpers.Helper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/user")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);
    //user login page

    //user dashboard page

    //user dashboard page
    @RequestMapping(value = "/dashboard")
    public String userDashboard(){
        System.out.println("User dashboard");
        return "user/dashboard";
    }

    //users add contacts page
    @RequestMapping(value = "/profile")
    public String userProfile(Authentication authentication){
        String username = Helper.getEmailOfLoggedInUser(authentication);

        logger.info("User logged in: {}", username);

        System.out.println("User profile");
        return "user/profile";
    }

    //user view contacts

    //user edit contact

    //user delete contact

    //user search contact


}
