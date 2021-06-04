package decorator_pattern;

public abstract class Drink {

	protected String name = "";

	public abstract int cost();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
