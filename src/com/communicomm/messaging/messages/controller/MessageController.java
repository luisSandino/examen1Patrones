package com.communicomm.messaging.messages.controller;

import java.util.ArrayList;

import com.communicom.messaging.messages.Message;
import com.communicom.messaging.messages.signals.MessageCategory;


public class MessageController {
	ArrayList<Message> messagesList = new ArrayList<Message>();
	
	
	private static Message sendMessage(MessageCategory messageOption){
		
		return MessageFactory.createMessage(messageOption);
	}

	public void listMessage(int messageOption) {
		if (messageOption == 1){
			for (Message currentRequest: messagesList){
				System.out.println(currentRequest);
			}
		}
		
	}

}
