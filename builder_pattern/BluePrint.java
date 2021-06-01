package builder_pattern;

public abstract class BluePrint {
	public abstract void setCpu();

	public abstract void setRam();

	public abstract void setStorage();

	protected abstract Computer getComputer();
}
