package visitor_pattern;

public class VisitableA implements Visitable {

	int numberOfMember;

	public VisitableA(int numberOfMember) {
		this.numberOfMember = numberOfMember;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
