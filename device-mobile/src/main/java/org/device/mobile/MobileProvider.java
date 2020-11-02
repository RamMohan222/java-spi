package org.device.mobile;

import org.device.spi.IDevice;
import org.device.spi.IDeviceProvider;

public class MobileProvider implements IDeviceProvider {

	@Override
	public IDevice create(String name) {
		return new Mobile(name);
	}

}
