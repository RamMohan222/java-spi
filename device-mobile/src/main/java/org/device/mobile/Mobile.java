package org.device.mobile;

import org.device.api.IDevice;

public class Mobile implements IDevice {

	@Override
	public void connect() {
		System.out.println("Mobile Connected!!!");
	}

	@Override
	public void publish(String message) {
		System.out.println("Mobile Message: " + message);
	}

}
