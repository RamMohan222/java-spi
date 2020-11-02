package org.device.main;

import org.device.spi.IDevice;
import org.devices.provider.DeviceService;

public class App {
	public static void main(String[] args) {
		DeviceService service = DeviceService.getInstance();
		service.loadProviders().forEach(provider -> {
			IDevice device = provider.create("Github");
			System.out.println(device.getDeviceName());
			device.connect();
			device.publish("Hello World!");
		});
	}
}
