package com.project.smartContactManager.repsitories;

import com.project.smartContactManager.entities.Contact;
import com.project.smartContactManager.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepo extends JpaRepository<Contact, String> {
    List<Contact> findByUserName(User user);

    @Query("SELECT c FROM Contact c where c.user.userId = :userId")
    List<Contact> findByUserId(@Param("userId") String userId);
}
