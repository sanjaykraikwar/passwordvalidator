package com.epam.passwordvalidator.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.epam.passwordvalidator.model.ValidationResult;
import com.epam.passwordvalidator.service.ValidationService;

@RestController
public class ValidationController {
	
	static Logger logger = LoggerFactory.getLogger(ValidationController.class);
	
	@Autowired
	ValidationService validationService;
	
	
	
	
	@PostMapping("/validate")
	public ValidationResult validatePassword(@RequestBody String password) {
		
		logger.info("Inside validate password Controller ");
	
		return validationService.validatePassword(password);
		
	}

}
