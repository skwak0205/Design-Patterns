package strategy_pattern;

public class Main {
	public static void main(String[] args) {
		SortEngine se;

		Sort st = new QuickSort();

		se = new SortEngine(st);
		se.search();

		st = new MergeSort();
		se.setSorter(st);
		se.search();

		System.out.println("------------------------------------");

		GameCharacter character = new GameCharacter();
		character.attack();

		character.setWeapon(new Knife());
		character.attack();

		character.setWeapon(new Sword());
		character.attack();
	}
}
