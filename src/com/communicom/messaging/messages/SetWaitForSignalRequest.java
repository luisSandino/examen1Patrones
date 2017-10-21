package com.communicom.messaging.messages;



import com.communicom.messaging.messages.signals.SignalType;

public class SetWaitForSignalRequest {
	
	private SignalType signal;
	private String signalValue;
	
	

	public SetWaitForSignalRequest(SignalType signal, String signalValue) {
		super();
		this.signal = signal;
		this.signalValue = signalValue;
	}

	public SignalType getSignal() {
		return signal;
	}

	public void setSignal(SignalType signal) {
		this.signal = signal;
	}

	public String getSignalValue() {
		return signalValue;
	}

	public void setSignalValue(String signalValue) {
		this.signalValue = signalValue;
	}
	
}
