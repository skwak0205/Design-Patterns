package templateMethod_pattern;

public class Elf extends Character {

	@Override
	public void selectFace() {
		System.out.println("엘프종족 중 얼굴 선택모드 실행!!");
	}

	@Override
	public void selectTall() {
		System.out.println("엘프종족의 키 범위 선택!!");
	}

}
