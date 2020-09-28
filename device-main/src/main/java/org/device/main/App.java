package org.device.main;

import org.devices.provider.DeviceProvider;

public class App {
	public static void main(String[] args) {
		DeviceProvider.loadDevices().forEach(device -> {
			device.connect();
			device.publish("Hellow World!!!");
		});
	}
}
