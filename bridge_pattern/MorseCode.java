package bridge_pattern;

public class MorseCode {
	private MorseCodeFunc func;

	public MorseCode(MorseCodeFunc func) {
		this.func = func;
	}

	public void setFunc(MorseCodeFunc func) {
		this.func = func;
	}

	public void dot() {
		func.dot();

	}

	public void dash() {
		func.dash();

	}

	public void space() {
		func.space();

	}
}
