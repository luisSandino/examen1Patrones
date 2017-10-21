package com.communicom.messaging.messages;

import java.time.LocalDateTime;

public class BootstrapOperationRequest extends Message{
	private String version;
	
	
	
	
	public BootstrapOperationRequest(String messageName, int messageNumber, String sourceAddress, String targetAddress,
			LocalDateTime emisionTime) {
		super(messageName, messageNumber, sourceAddress, targetAddress, emisionTime);
		
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	
}
