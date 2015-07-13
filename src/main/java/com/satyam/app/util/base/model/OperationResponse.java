package com.satyam.app.util.base.model;

/**
 * This class is to be used in order to send error/success response
 * @author Satyam Shandilya
 *
 */
public final class OperationResponse {

	private final int responseCode;
	private final String responseDescription;
	private final String applicationMessage;
	
	public OperationResponse(int responseCode, String responseDescription,
			String applicationMessage) {
		super();
		this.responseCode = responseCode;
		this.responseDescription = responseDescription;
		this.applicationMessage = applicationMessage;
	}

	/**
	 * @return the responseCode
	 */
	public int getResponseCode() {
		return responseCode;
	}

	/**
	 * @return the responseDescription
	 */
	public String getResponseDescription() {
		return responseDescription;
	}

	/**
	 * @return the applicationMessage
	 */
	public String getApplicationMessage() {
		return applicationMessage;
	}
	
}
