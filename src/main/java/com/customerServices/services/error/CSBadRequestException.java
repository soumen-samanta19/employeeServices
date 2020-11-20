package com.customerServices.services.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CSBadRequestException extends CSGenericRTException 
{


private static final long serialVersionUID = 600893655100344L;

public CSBadRequestException(String message) {
super(message);
}
}
