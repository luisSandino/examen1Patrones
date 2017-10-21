package com.communicomm.messaging.messages.controller;

import com.communicom.messaging.messages.BootstrapOperationRequest;
import com.communicom.messaging.messages.BootstrapOperationResponse;
import com.communicom.messaging.messages.Message;
import com.communicom.messaging.messages.PingServerRequest;
import com.communicom.messaging.messages.PingServerResponse;
import com.communicom.messaging.messages.SetWaitForSignalRequest;
import com.communicom.messaging.messages.SetWaitForSignalResponse;
import com.communicom.messaging.messages.signals.MessageCategory;

public class MessageFactory {
	
	public static Message createMessage(MessageCategory messageType) {
		switch(messageType) {
		case BootstrapOperationRequest: 
			return new BootstrapOperationRequest();
		case BootstrapOperationResponse: 
			return new BootstrapOperationResponse();
		case PingServerRequest: 
			return new PingServerRequest();
		case PingServerResponse:
			return new PingServerResponse();
		case SetWaitForSignalRequest:
			return new SetWaitForSignalRequest();
		case SetWaitForSignalResponse:
			return new SetWaitForSignalResponse();
		return null;
		}
	}

}
