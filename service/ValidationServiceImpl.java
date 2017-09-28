package com.epam.passwordvalidator.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.epam.passwordvalidator.controller.ValidationController;
import com.epam.passwordvalidator.model.ValidationResult;


@Component
public class ValidationServiceImpl implements ValidationService {

	static Logger logger = LoggerFactory.getLogger(ValidationController.class);
	@Override
	public ValidationResult validatePassword(String password) {
		
		logger.info("Inside validate password Service ");
		
		
		ValidationResult result =new ValidationResult();
		
		result.setValid(true);
		
		
		return result;
	}

}
