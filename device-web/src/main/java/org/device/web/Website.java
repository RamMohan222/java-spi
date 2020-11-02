package org.device.web;

import org.device.spi.IDevice;

public class Website implements IDevice {

	private String title;

	public Website(String title) {
		this.title = title;
	}

	@Override
	public void connect() {
		System.out.println("Website connected!!!");
	}

	@Override
	public void publish(String message) {
		System.out.println("Web Message:" + message);
	}

	@Override
	public String getDeviceName() {
		return "Website-" + title;
	}

}
