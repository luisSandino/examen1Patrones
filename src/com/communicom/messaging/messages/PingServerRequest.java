package com.communicom.messaging.messages;

import java.time.LocalDateTime;

public class PingServerRequest extends Message{

	public PingServerRequest(String messageName, int messageNumber, String sourceAddress, String targetAddress,
			LocalDateTime emisionTime) {
		super(messageName, messageNumber, sourceAddress, targetAddress, emisionTime);
		
	}
	
	
}
