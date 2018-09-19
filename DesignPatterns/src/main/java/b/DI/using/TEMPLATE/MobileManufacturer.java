package b.DI.using.TEMPLATE;

public class MobileManufacturer extends Manufacturer {

	private Device device;

	public MobileManufacturer(Device device) {
		super();
		this.device = device;
	}

	@Override
	public void assembly() {
		System.out.println(device.getType() + " assembly !");
	}

	@Override
	public void testing() {
		System.out.println(device.getType() + " testing !");
	}

	@Override
	public void packaging() {
		System.out.println(device.getType() + " packaging !");

	}

	@Override
	public void storage() {
		System.out.println(device.getType() + "storage !");

	}

}
