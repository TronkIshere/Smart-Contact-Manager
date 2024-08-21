package com.project.smartContactManager.controllers;

import com.project.smartContactManager.entities.User;
import com.project.smartContactManager.helpers.Helper;
import com.project.smartContactManager.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;
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
    public String userProfile(Model model, Authentication authentication){


        return "user/profile";
    }

    //user view contacts

    //user edit contact

    //user delete contact

    //user search contact


}
