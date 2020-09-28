package org.device.web;

import org.device.api.IDevice;

public class Website implements IDevice {

	@Override
	public void connect() {
		System.out.println("Website connected!!!");
	}

	@Override
	public void publish(String message) {
		System.out.println("Web Message:" + message);
	}

}
