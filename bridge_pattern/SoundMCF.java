package bridge_pattern;

public class SoundMCF implements MorseCodeFunc {

	@Override
	public void dot() {
		System.out.print("삣");
	}

	@Override
	public void dash() {
		System.out.print("삐~");
	}

	@Override
	public void space() {
		System.out.print(" ");
	}

}
