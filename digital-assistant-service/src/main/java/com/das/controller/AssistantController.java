package com.das.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.das.entity.Assistant;
import com.das.service.AssistantService;

@RestController
public class AssistantController {
	
    // Injecting the AssistantService dependency
	@Autowired
	private AssistantService assistantService;

	// Endpoint to define a new assistant
	@PostMapping("/define_assistant")
	public String defineAssistant(@RequestBody Assistant request) {
		assistantService.defineAssistant(request.getName(), request.getResponse());
		return "Assistant defined successfully";
	}

	// Endpoint to send a message to an assistant
	@PostMapping("/send_message/{name}")
	public String sendMessage(@PathVariable String name, @RequestBody Assistant request) {
		return assistantService.sendMessage(name, request.getMessage());
	}

}