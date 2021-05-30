package templateMethod_pattern;

public class Main {
	public static void main(String[] args) {
		Character human = new Human();
		human.makeCharacter();

		System.out.println();

		Character elf = new Elf();
		elf.makeCharacter();

		System.out.println();

		Character human2 = new Human(false);
		human2.makeCharacter();
	}

}
