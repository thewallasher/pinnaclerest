package com.pinnacle.restfulwebservices.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Property not found")
public class PropertyNotFoundException extends RuntimeException {

	public PropertyNotFoundException(String arg0) {
		super(arg0);
	}

}
