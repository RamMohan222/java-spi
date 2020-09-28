package org.devices.provider;

import java.util.List;
import java.util.ServiceLoader;
import java.util.stream.Collectors;

import org.device.api.IDevice;

public class DeviceProvider {

	public static List<IDevice> loadDevices() {
		ServiceLoader<IDevice> loader = ServiceLoader.load(IDevice.class);
		return loader.stream().map(c -> c.get()).collect(Collectors.toList());
	}
}
