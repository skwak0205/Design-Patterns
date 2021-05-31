package factoryMethod_pattern;

public class MTest {
	public static void main(String[] args) {
		ItemCreater creator;
		Item item;

		creator = new HpCreator();
		item = creator.create();
		item.use();

		creator = new MpCreator();
		item = creator.create();
		item.use();
	}
}
