package adapter_pattern;

public class AdapterImpl implements Adapter {

//	@Override
//	public Float twiceOf(Float f) {
//
//		return (float) Math.twoTime(f.doubleValue());
//	}

	@Override
	public Float twiceOf(Float f) {
		// 강화된 알고리즘 사용
		return Math.doubled(f.doubleValue()).floatValue();
	}

	@Override
	public Float halfOf(Float f) {
		return (float) Math.half(f.doubleValue());
	}

}
