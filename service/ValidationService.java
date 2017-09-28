package com.epam.passwordvalidator.service;

import org.springframework.stereotype.Component;

import com.epam.passwordvalidator.model.ValidationResult;

@Component
public interface ValidationService {
	
	public ValidationResult validatePassword(String password);
		

}
