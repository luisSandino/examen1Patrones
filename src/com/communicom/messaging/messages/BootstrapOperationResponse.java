package com.communicom.messaging.messages;

import java.time.LocalDateTime;

public class BootstrapOperationResponse extends Message{
	
	public BootstrapOperationResponse(String messageName, int messageNumber, String sourceAddress, String targetAddress,
			LocalDateTime emisionTime) {
		super(messageName, messageNumber, sourceAddress, targetAddress, emisionTime);
		
	}

	private String version;
	private boolean result;
	private String errorMessage;
	


	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
	
	
}
