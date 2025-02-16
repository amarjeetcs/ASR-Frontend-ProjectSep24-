package com.asr.website.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asr.website.model.Contact;
import com.asr.website.repository.ContactRepository;

@Service
public interface ContactService {

	Contact saveContact(Contact contact);

	List<Contact> getAllContacts();

	Optional<Contact> getContactById(Long id);

	Contact updateContact(Long id, Contact updatedContact);

	void deleteContact(Long id);
}
