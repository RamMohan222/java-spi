package org.device.spi;

public interface IDevice {

	public String getDeviceName();

	public void connect();

	public void publish(String message);
}
