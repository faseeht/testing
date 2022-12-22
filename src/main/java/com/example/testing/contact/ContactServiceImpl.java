package com.example.testing.contact;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    List<Contact> list = Arrays.asList(
            new Contact(1, "memonfaseeh@gmail.com", "Faseeh Tahir", 1),
            new Contact(2, "memon_faseeh@gmail.com", "Faseeh Tahir", 1),
            new Contact(3, "tahir@gmail.com", "Tahir Hussain", 2),
            new Contact(4, "sumair@gmail.com", "Sumair Tahir", 3)
    );
    @Override
    public List<Contact> getContactsByUserId(Integer userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
