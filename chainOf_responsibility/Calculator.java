package chainOf_responsibility;

public abstract class Calculator {

	private Calculator nextCaculator;

	protected void setNextCalculator(Calculator nextCaculator) {
		this.nextCaculator = nextCaculator;
	}

	public boolean process(Request request) {

		if (operator(request)) {
			return true;
		} else {
			if (nextCaculator != null)
				return nextCaculator.operator(request);
		}
		return false;

		// if (preCaculator != null)
		// if(preCaculator.process(request))
		// return true;
		//
		// return operator(request);
	}

	protected abstract boolean operator(Request request);

}
