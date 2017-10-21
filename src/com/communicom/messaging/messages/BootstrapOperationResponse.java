package com.communicom.messaging.messages;

public class BootstrapOperationResponse extends Message{
	private String version;
	private boolean result;
	private String errorMessage;
	
	@Override
	public String toString() {
		return "BootstrapOperationResponse [version=" + version + ", result=" + result + ", errorMessage="
				+ errorMessage + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

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
