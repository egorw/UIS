package practic.task5;

import java.util.Map;

import nedis.study.interfaces.t5.collections.MapKey;
import nedis.study.interfaces.t5.collections.MapUtils;
import nedis.study.interfaces.t5.collections.MultiMap;

public class MapUtilsImpl implements MapUtils {

	@Override
	public MultiMap<MapKey, Integer> merge(Map<MapKey, Integer>... maps) throws IllegalArgumentException {
		
		MultiMap<MapKey, Integer> res = new MultiMapImpl<>();
		for(Map<MapKey, Integer> map : maps) {
			if (map == null) {
				throw new IllegalArgumentException("map is null");
			}
			res.putAll(map);
		}
		return res;
	}

}
