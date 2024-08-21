package com.project.smartContactManager.controllers;

import com.project.smartContactManager.entities.Contact;
import com.project.smartContactManager.entities.User;
import com.project.smartContactManager.forms.ContactForm;
import com.project.smartContactManager.helpers.Helper;
import com.project.smartContactManager.services.ContactService;
import com.project.smartContactManager.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user/contacts")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @Autowired
    private UserService userService;

    @RequestMapping("/add")
    //add contact page: handler
    public String addContactView(Model model){
        ContactForm contactForm = new ContactForm();
        model.addAttribute("contactForm", contactForm);
        return "user/add_contact";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String saveContact(@ModelAttribute ContactForm contactForm, Authentication authentication){
        //process the form data

        String username = Helper.getEmailOfLoggedInUser(authentication);
        //form -> contact

        User user = userService.getUserByEmail(username);

        //process the contact picture

        Contact contact = new Contact();
        contact.setName(contactForm.getName());
        contact.setFavorite(contactForm.isFavorite());
        contact.setEmail(contactForm.getEmail());
        contact.setPhoneNumber(contactForm.getPhoneNumber());
        contact.setAddress(contactForm.getAddress());
        contact.setDescription(contactForm.getDescription());
        contact.setUser(user);
        contact.setLinkedInLink(contactForm.getLinkedInLink());
        contact.setWebsiteLink(contactForm.getWebsiteLink());
        contactService.save(contact);
        System.out.println(contactForm);

        //set the contact picture url

        //set message to be displayed on the view

        return "redirect:/user/contacts/add";
    }
}
