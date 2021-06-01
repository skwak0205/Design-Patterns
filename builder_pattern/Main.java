package builder_pattern;

public class Main {
	public static void main(String[] args) {

		ComputerFactory factory = new ComputerFactory();
		factory.setBlueprint(new LgGramBlueprint());
		factory.make();
		Computer computer = factory.getComputer();

		// Computer computer = new Computer("i7", "16g", "256g ssd");
		System.out.println(computer);

		System.out.println("----------------------------------------");

		Vehicle car = new Vehicle.VehicleBuilder("1500cc", 4).setAirbags(4).build();
		Vehicle bike = new Vehicle.VehicleBuilder("250cc", 2).build();

		System.out.println(car.getEngine());
		System.out.println(car.getWheel());
		System.out.println(car.getAirbags());

		System.out.println(bike.getEngine());
		System.out.println(bike.getWheel());
		System.out.println(bike.getAirbags());
	}
}
