package factoryMethod_pattern;

public class RealTransCreator_TransCompany extends TransCreator {

	@Override
	public TransProduct transCreate(String trans) {

		if (trans.equals("taxi")) {
			return new TransProduct_Taxi();
		} else {
			return new TransProduct_Bicycle();
		}

	}

}
