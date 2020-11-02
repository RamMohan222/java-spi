package org.devices.provider;

import java.util.ServiceLoader;
import java.util.stream.Stream;

import org.device.spi.IDeviceProvider;

public class DeviceService {

	private static ServiceLoader<IDeviceProvider> loader = null;
	private static final DeviceService INSTANCE = new DeviceService();

	private DeviceService() {
		loader = ServiceLoader.load(IDeviceProvider.class);
	}

	public static synchronized DeviceService getInstance() {
		return INSTANCE;
	}

	public Stream<IDeviceProvider> loadProviders() {
		return loader.stream().map(o -> o.get());
	}
}
