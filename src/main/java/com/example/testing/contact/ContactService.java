package com.example.testing.contact;

import java.util.List;

public interface ContactService {

    List<Contact> getContactsByUserId(Integer userId);
}
