package com.customerServices.util;

import com.customerServices.services.error.CSBadRequestException;

public class Validate {

	public void percentageValidation(int percentage){
		if(percentage > 55){
			throw new CSBadRequestException("percentage should be less than 55");
		}
	}
}
