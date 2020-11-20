package com.customerServices.util;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.customerServices.services.error.CSBadRequestException;


public class ValidateTest {

	@Test(enabled = true, description = "Ensures percentage is validated and error is generated as expected", dataProvider = "dpPercentageValidation")
	public void testPercentageValidation(int percentage) throws CSBadRequestException {
		Validate validate=new Validate();
		validate.percentageValidation(percentage);
	}

	@DataProvider
	public Object[][] dpPercentageValidation() {
		int  percentage1 = 0;
		int  percentage2 = 45;
		int  percentage3 = 56;

		return new Object[][] { { percentage1 },{ percentage2 },{ percentage3 } };
	}

}
