package org.device.api;

public interface IDevice {
	
	public void connect();
	
	public void publish(String message);
}
