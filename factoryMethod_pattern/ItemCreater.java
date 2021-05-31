package factoryMethod_pattern;

public abstract class ItemCreater {
	public Item create() {
		Item item;
		requestItemsInfo();
		item = createItem();
		createItemsLog();

		return item;
	}

	protected abstract void requestItemsInfo();

	protected abstract void createItemsLog();

	// 아이템을 생성하는 알고리즘
	protected abstract Item createItem();
}
