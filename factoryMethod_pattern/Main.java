package factoryMethod_pattern;

public class Main {
	public static void main(String[] args) {
		TransCreator tc = new RealTransCreator_TransCompany();

		TransProduct tp;

		tp = tc.transCreate("bicycle");
		tp.useTrans();

		tp = tc.transCreate("taxi");
		tp.useTrans();
	}
}
