package org.device.spi;

public interface IDeviceProvider {
	IDevice create(String name);
}
