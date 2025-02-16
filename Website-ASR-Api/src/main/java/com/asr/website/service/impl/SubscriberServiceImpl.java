package com.asr.website.service.impl;

import com.asr.website.repository.SubscriberRepository;
import com.asr.website.service.SubscriberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscriberServiceImpl implements SubscriberService {

    @Autowired
    private SubscriberRepository subscriberRepository;

    @Override
    public String addSubscriber(String email) {
        // Create a new Subscriber entity and set the email
        com.asr.website.model.Subscriber subscriber = new com.asr.website.model.Subscriber();
        subscriber.setEmail(email);
        
        // Save the Subscriber to the database
        subscriberRepository.save(subscriber);
        
        return "Subscriber added successfully with email: " + email;
    }
}
