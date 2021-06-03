package bridge_pattern;

public class DefaulMCF implements MorseCodeFunc {

	@Override
	public void dot() {
		System.out.print("o");
	}

	@Override
	public void dash() {
		System.out.print("-");
	}

	@Override
	public void space() {
		System.out.print(" ");
	}

}
