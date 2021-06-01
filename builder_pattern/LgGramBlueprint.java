package builder_pattern;

public class LgGramBlueprint extends BluePrint {

	private Computer computer;

	public LgGramBlueprint() {
		computer = new Computer("default", "default", "default");
	}

	@Override
	public void setCpu() {
		computer.setCpu("i7");
	}

	@Override
	public void setRam() {
		computer.setRam("8GB");
	}

	@Override
	public void setStorage() {
		computer.setStorage("526GB SSD");
	}

	@Override
	protected Computer getComputer() {
		return computer;
	}

}
