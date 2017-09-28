package com.epam.passwordvalidator.service;

import org.springframework.stereotype.Component;

@Component
public interface ValidationRule {
	
	public boolean validate(String inPassword);
	

	public String getMessage();

}
