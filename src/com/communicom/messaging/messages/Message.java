package com.communicom.messaging.messages;

import java.time.LocalDateTime;



public class Message {
	private String messageName;
	private int messageNumber;
	private String sourceAddress;
	private String targetAddress;
	private LocalDateTime emisionTime;
	
	
	
	
	@Override
	public String toString() {
		return "Nombre del mensaje= " + messageName + ", número de mensaje= " + messageNumber + ", Fecha del mensaje= "
				+ emisionTime + "]";
	}
	public Message(String messageName, int messageNumber, String sourceAddress, String targetAddress,
			LocalDateTime emisionTime) {
		super();
		this.messageName = messageName;
		this.messageNumber = messageNumber;
		this.sourceAddress = sourceAddress;
		this.targetAddress = targetAddress;
		this.emisionTime = emisionTime;
	}
	
	
	public Message() {
		super();
	}
	public String getMessageName() {
		return messageName;
	}
	public void setMessageName(String messageName) {
		this.messageName = messageName;
	}
	public int getMessageNumber() {
		return messageNumber;
	}
	public void setMessageNumber(int messageNumber) {
		this.messageNumber = messageNumber;
	}
	public String getSourceAddress() {
		return sourceAddress;
	}
	public void setSourceAddress(String sourceAddress) {
		this.sourceAddress = sourceAddress;
	}
	public String getTargetAddress() {
		return targetAddress;
	}
	public void setTargetAddress(String targetAddress) {
		this.targetAddress = targetAddress;
	}
	public LocalDateTime getEmisionTime() {
		return emisionTime;
	}
	public void setEmisionTime(LocalDateTime emisionTime) {
		this.emisionTime = emisionTime;
	}
	
	
	

}
