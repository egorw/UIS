package practic.task5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import nedis.study.interfaces.t5.collections.CollectionUtils;

public class CollectionUtilsImpl implements CollectionUtils {
	
	private void checkCollections(Collection<Integer> a, Collection<Integer> b) {
		if (a == null || b == null) {
			throw new NullPointerException();
		}
	}

	@Override
	public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
		
		checkCollections(a, b);
		
		Collection<Integer> result = new ArrayList<>(a);
		result.addAll(b);
		return result;
	}

	@Override
	public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
		
		checkCollections(a, b);
		
		Collection<Integer> result = new ArrayList<>();
		Collection<Integer> bCopy = new ArrayList<>(b);
		for (Integer el : a) {
			if (bCopy.remove(el)) {
				result.add(el);
			}
		}
		
		
		return result;
	}

	@Override
	public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b)
			throws NullPointerException {
		
		checkCollections(a, b);
		
		return new HashSet<>(union(a, b));
	}

	@Override
	public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b)
			throws NullPointerException {
		
		checkCollections(a, b);
		
		return new HashSet<>(intersection(a, b));
	}

	@Override
	public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
		
		checkCollections(a, b);
		
		Collection<Integer> result = new ArrayList<>(a);
		
		result.removeAll(b);
		
		return result;
	}

}
