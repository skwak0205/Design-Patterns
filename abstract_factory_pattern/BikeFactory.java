package abstract_factory_pattern;

public interface BikeFactory {
	public Body createBody();

	public Wheel createWheel();
}
