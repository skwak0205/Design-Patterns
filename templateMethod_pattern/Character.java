package templateMethod_pattern;

public abstract class Character {
	final void makeCharacter() {
		decideId();
		selectFace();
		selectTall();

		// hook
		if (isNickNameAdded())
			addNickName();
	}

	public void decideId() {
		System.out.println("id 선택");
	}

	public abstract void selectFace();

	public abstract void selectTall();

	public void addNickName() {
		System.out.println("nickname 추가!!");
	}

	// hook method 추가
	boolean isNickNameAdded() {
		return true;
	}
}
