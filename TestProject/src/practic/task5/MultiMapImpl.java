package practic.task5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import nedis.study.interfaces.t5.collections.MultiMap;

public class MultiMapImpl<K, V> implements MultiMap<K, V> {
	
	private Map<K, List<V>> map = new HashMap<>();

	@Override
	public int size() {
		
		return map.size();
	}

	@Override
	public boolean isEmpty() {
		
		return map.isEmpty();
	}

	@Override
	public boolean containsKey(Object key) {
		
		
		return map.containsKey(key);
	}

	@Override
	public boolean containsValue(Object value) {
		
		for(List<V> list : map.values()) {
			if(list.contains(value)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public V put(K key, V value) {
		
		List <V> list = map.get(key);
		if(list == null) {
			list = new ArrayList<>();
			map.put(key, list);
			
		}
		
		list.add(value);
		
		return null;
	}

	@Override
	public void putAll(Map<? extends K, ? extends V> m) {
		
		for(Map.Entry<? extends K, ? extends V> entry : m.entrySet()) {
			put(entry.getKey(), entry.getValue());
		}

	}

	@Override
	public void clear() {
		
		map.clear();

	}

	@Override
	public Set<K> keySet() {
		
		return map.keySet();
	}

	@Override
	public Collection<V> values() {
		
		Collection<V> res = new ArrayList<>();
		for(List<V> list : map.values()) {
			res.addAll(list);
		}
		return res;
	}

	@Override
	public Set<Entry<K, V>> entrySet() {
		
		return null;
	}

	@Override
	public int countValues(K key) {
		
		List <V> list = map.get(key);
		
		return list == null ? 0 : list.size();
	}

	@Override
	public V get(Object key) {
		
		List <V> list = map.get(key);
		
		return list == null ? null : list.get(list.size()-1);
	}

	@Override
	public Iterator<V> valuesIterator(K key) {
		
		List <V> list = map.get(key);
		
		return list == null ? Collections.EMPTY_LIST.iterator() : list.iterator();
	}

	@Override
	public V remove(Object key) {
		
		map.remove(key);
		return null;
	}
	
	@Override
	public String toString() {
		return "MultiMapImpl [map=" + map + "]";
	}

}
