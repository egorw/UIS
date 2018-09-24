package practic.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


import nedis.study.interfaces.t5.collections.ListUtils;

public class ListUtilsImpl implements ListUtils {

	@Override
	public List<String> asList(String... strings) throws IllegalArgumentException {
		
		for (String string : strings) {
			if (string == null) {
				throw new IllegalArgumentException("parameter is null");
			}
		}
		return Arrays.asList(strings);
	}

	@Override
	public List<Double> sortedList(List<Double> data) throws IllegalArgumentException {
		if(data == null) {
			throw new IllegalArgumentException("data is null");
		}
		List<Double> res = new ArrayList<>(data);
		Collections.sort(res, Collections.reverseOrder());
		return res;
	}
}
