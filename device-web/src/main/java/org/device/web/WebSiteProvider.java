package org.device.web;

import org.device.spi.IDevice;
import org.device.spi.IDeviceProvider;

public class WebSiteProvider implements IDeviceProvider {

	@Override
	public IDevice create(String name) {
		return new Website(name);
	}

}
