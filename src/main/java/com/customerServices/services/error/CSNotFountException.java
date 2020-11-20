package com.customerServices.services.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CSNotFountException extends RuntimeException 
		 {

	private static final long serialVersionUID = 6008930253065510089L;

	public CSNotFountException(String message) {
		super(message);
	}
}
