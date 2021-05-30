package templateMethod_pattern;

public class Human extends Character {
	private boolean isNickNameAdded = true;

	public Human() {

	}

	public Human(boolean isNickNameAdded) {
		this.isNickNameAdded = isNickNameAdded;
	}

	@Override
	public void selectFace() {
		System.out.println("인간종족 중 얼굴 선택 모드 실행!!");
	}

	@Override
	public void selectTall() {
		System.out.println("인간종족의 키범위 선택!!");
	}

	@Override
	boolean isNickNameAdded() {
		return this.isNickNameAdded;
	}
}
