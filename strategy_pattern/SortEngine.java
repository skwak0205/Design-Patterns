package strategy_pattern;

import java.util.ArrayList;
import java.util.List;

public class SortEngine {
	private Sort sorter;

	public SortEngine(Sort ss) {
		this.sorter = ss;
	}

	public void setSorter(Sort ss) {
		this.sorter = ss;
	}

	public List<Object> search() {
		// sort할, array 값을 구성
		List list = new ArrayList<Object>();

		sorter.sort(list);
		return list;
	}
}
