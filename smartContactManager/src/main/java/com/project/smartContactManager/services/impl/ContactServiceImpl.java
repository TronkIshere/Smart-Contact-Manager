package com.project.smartContactManager.services.impl;

import com.project.smartContactManager.entities.Contact;
import com.project.smartContactManager.helpers.ResourceNotFoundException;
import com.project.smartContactManager.repsitories.ContactRepo;
import com.project.smartContactManager.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepo contactRepo;

    @Override
    public Contact save(Contact contact) {
        return null;
    }

    @Override
    public Contact update(Contact contact) {
        return null;
    }

    @Override
    public List<Contact> getAll() {
        return contactRepo.findAll();
    }

    @Override
    public Contact getById(String id) {
        return contactRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Contact not found with given id: " + id));
    }

    @Override
    public void delete(String id) {
        var contact = contactRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Contact not found with given id: " + id));
        contactRepo.delete(contact);
    }

    @Override
    public List<Contact> search(String name, String email, String phoneNumber) {
        return null;
    }

    @Override
    public List<Contact> getByUserId(String userId) {
        return contactRepo.findByUserId(userId);
    }
}
