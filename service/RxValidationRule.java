package com.epam.passwordvalidator.service;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;

/**
 * Implementation of ValidationRule that validates a password based on the specified regex.
 * If the password matches the regex, then it's valid, otherwise it's invalid.
 */

@Component
public class RxValidationRule implements ValidationRule {
	
	private String regex;
	
	private String message;
	
	public RxValidationRule() { }
	
	public RxValidationRule(String regex, String message) {
		this.regex = regex;
		this.message = message;
	}


	public boolean validate(String password) {
		if (Pattern.matches(regex, password)) {
			return true;
		}
		return false;
	}


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setRegex(String regex) {
		this.regex = regex;
	}

}
