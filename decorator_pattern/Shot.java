package decorator_pattern;

public class Shot extends DrinkDecorator {

	public Shot(Drink drink) {
		this.drink = drink;
	}

	@Override
	public String getName() {
		return "shot " + drink.getName();
	}

	@Override
	public int cost() {
		return 0;
	}
}
