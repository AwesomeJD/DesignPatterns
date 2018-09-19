package b.DI.using.TEMPLATE.driver;

import b.DI.using.TEMPLATE.ConputerManufacturer;
import b.DI.using.TEMPLATE.Device;
import b.DI.using.TEMPLATE.DeviceType;
import b.DI.using.TEMPLATE.Manufacturer;
import b.DI.using.TEMPLATE.MobileManufacturer;

public class HardwareManufacturer {

	public static void main(String args[]) {

		Manufacturer mobileManufacturer = new MobileManufacturer(new Device("Samsung Galaxy", DeviceType.MOBILE_PHONE));
		mobileManufacturer.manufacture();
		
		Manufacturer computerManufacturer = new ConputerManufacturer(new Device("Samsung Galaxy", DeviceType.COMPUTER));
		computerManufacturer.manufacture();
	
		
	}

}
 	