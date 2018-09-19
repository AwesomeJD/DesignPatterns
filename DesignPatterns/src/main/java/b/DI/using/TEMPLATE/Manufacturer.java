package b.DI.using.TEMPLATE;

public abstract class Manufacturer {

	protected abstract void assembly();

	protected abstract void testing();

	protected abstract void packaging();

	protected abstract void storage();

	//template method
	public final void manufacture() {
		assembly();
		testing();
		packaging();
		storage();
	}

}
