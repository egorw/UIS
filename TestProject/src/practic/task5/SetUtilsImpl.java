package practic.task5;


import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import nedis.study.interfaces.t5.collections.SetUtils;

public class SetUtilsImpl implements SetUtils {

	@Override
	public SortedSet<String> orderedSet(Collection<Integer> collection1, Set<String> set2) throws NullPointerException {
		if (set2 == null || collection1 == null) {
			throw new NullPointerException();
		}
		
		SortedSet<String> res = new TreeSet<>(Collections.reverseOrder());
		res.addAll(set2);
		for(Integer el : collection1){
			res.add(el.toString());
		}
		return res;
	}

	@Override
	public Set<Integer> customOrderSet(int val1, int val2, int val3, int val4, int val5) {
		Set<Integer> result = new LinkedHashSet<>();
		result.add(val1);
		result.add(val2);
		result.add(val3);
		result.add(val4);
		result.add(val5);
		return result;
	}

}
