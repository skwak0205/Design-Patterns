package visitor_pattern;

import java.util.ArrayList;

public class Application {
	public static void main(String[] args) {
		ArrayList<Visitable> as = new ArrayList<Visitable>();

		as.add(new VisitableA(1));
		as.add(new VisitableA(2));
		as.add(new VisitableA(3));
		as.add(new VisitableA(4));
		as.add(new VisitableA(5));

		VisitorA visitor = new VisitorA();
		for (Visitable va : as) {
			va.accept(visitor);
		}
		System.out.println(visitor.getNumber());
	}
}
