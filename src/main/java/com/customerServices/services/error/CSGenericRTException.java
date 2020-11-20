package com.customerServices.services.error;

/**
 * This exception is meant to be the ancestor of every ContactServices exception should ease the handling of System 
 * errors
 *
 */
public class CSGenericRTException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8526435307616917532L;

	public CSGenericRTException() { /* Privatizing constructor to force users to provide info */} // NOSONAR

	public CSGenericRTException(String message) {
		super(message);
	}

	public CSGenericRTException(Throwable cause) {
		super(cause);
	}

	public CSGenericRTException(String message, Throwable cause) {
		super(message, cause);
	}

	public CSGenericRTException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
