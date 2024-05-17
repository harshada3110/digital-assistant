package com.das.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.das.entity.Assistant;
import com.das.repository.AssistantRepository;

import jakarta.transaction.Transactional;

@Service
public class AssistantService {
	
    // Injecting the AssistantRepository dependency
	@Autowired
	private AssistantRepository assistantRepository;

    // Method to define a new assistant
	@Transactional
	public void defineAssistant(String name, String response) {
        // Creating a new Assistant entity
		Assistant assistant = new Assistant();
		assistant.setName(name);
		assistant.setResponse(response);
		assistantRepository.save(assistant);
	}

	// Method to send a message to an assistant and get a response
    @Transactional
	public String sendMessage(String name, String message) {
        // Finding an assistant by name
		Assistant assistant = assistantRepository.findByName(name);
		if (assistant != null) {
			// Check if the message matches any predefined responses
			if (message.equalsIgnoreCase("hello")) {
				return "Hi there!";
			} else if (message.equalsIgnoreCase("how are you?")) {
				return "I'm fine, thank you!";
			} else {
				// If no predefined response matches, return the default response
				return assistant.getResponse();
			}
		} else {
			return "Assistant with name '" + name + "' not found";
		}
	}

}
