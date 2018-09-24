package practic.task5;


import java.util.HashMap;
import java.util.Map;
import nedis.study.interfaces.t5.collections.MapKey;
import nedis.study.interfaces.t5.collections.MultiMap;



public class Launcher {

	public static void main(String[] args) {
		
	/*	CollectionUtils cu = new CollectionUtilsImpl();
		SetUtils su = new SetUtilsImpl();
		
		Set<String> col1 = new HashSet<>();
				
		col1.add("1");
		col1.add("1");
		col1.add("3");
		col1.add("5");
		col1.add("7");
		col1.add("9");
		
		
		Collection<Integer> col2 = new HashSet<>();
		
		col2.add(1);
		col2.add(2);
		col2.add(3);
		col2.add(4);
		col2.add(1);
		col2.add(10);

		Collection<Integer> col3 = new HashSet<>();
		
		col3.add(3);
		col3.add(2);
		col3.add(5);
		col3.add(9);
		col3.add(1);
		col3.add(10);
		
		System.out.println(su.orderedSet(col2, col1));
		System.out.println(cu.intersection(col3, col2));
		System.out.println(cu.intersectionWithoutDuplicate(col2, col3));
		System.out.println(cu.unionWithoutDuplicate(col2, col3));
		System.out.println(cu.difference(col2, col3));*/
		
		Map<MapKey, Integer> map1 = new HashMap<>();
		map1.put(new MapKeyImpl("1"), 1);
		map1.put(new MapKeyImpl("2"), 2);
		map1.put(new MapKeyImpl("3"), 3);

		Map<MapKey, Integer> map2 = new HashMap<>();
		map2.put(new MapKeyImpl("1"), 6);
		map2.put(new MapKeyImpl("4"), 4);
		map2.put(new MapKeyImpl("3"), 3);
		
		MultiMap<MapKey, Integer> multi = new MapUtilsImpl().merge(map1, map2);
				
		System.out.println(multi);
		System.out.println(multi.values());
		
		

	}

}
