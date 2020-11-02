package org.device.mobile;

import org.device.spi.IDevice;

public class Mobile implements IDevice {

	private String name;

	public Mobile(String name) {
		this.name = name;
	}

	@Override
	public void connect() {
		System.out.println("Mobile Connected!!!");
	}

	@Override
	public void publish(String message) {
		System.out.println("Mobile Message: " + message);
	}

	@Override
	public String getDeviceName() {
		return "Mobile " + name;
	}

}
