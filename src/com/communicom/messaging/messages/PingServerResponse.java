package com.communicom.messaging.messages;

import java.time.LocalDateTime;

public class PingServerResponse extends Message{

	public PingServerResponse(String messageName, int messageNumber, String sourceAddress, String targetAddress,
			LocalDateTime emisionTime) {
		super(messageName, messageNumber, sourceAddress, targetAddress, emisionTime);
		
	}


	
}
