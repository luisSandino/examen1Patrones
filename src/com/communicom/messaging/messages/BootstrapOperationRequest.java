package com.communicom.messaging.messages;

public class BootstrapOperationRequest extends Message{
	private String version;

	@Override
	public String toString() {
		return "BootstrapOperationRequest [version=" + version + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	
}
