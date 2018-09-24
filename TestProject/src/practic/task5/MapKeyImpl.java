package practic.task5;

import nedis.study.interfaces.t5.collections.MapKey;

public class MapKeyImpl implements MapKey, Comparable<MapKey> {
	private String value;

	public MapKeyImpl(String value) {
		super();
		this.value = value;
	}

	@Override
	public String getValue() {
		
		return value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof MapKeyImpl))
			return false;
		MapKeyImpl other = (MapKeyImpl) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	@Override
	public int compareTo(MapKey o) {
		
		if(o == null) {
			return 1;
		}
		return value.compareTo(o.getValue());
	}

	@Override
	public String toString() {
		return getValue();
	}
	
	

}
