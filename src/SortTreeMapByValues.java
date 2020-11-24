import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SortTreeMapByValues {
	public static void main(String[] args) {
		TreeMap<String, Integer> map = new TreeMap<>();
		map.put("sandeep", 10);
		map.put("rupesh", 20);
		map.put("rakesh", 30);
		map.put("sasi", 60);
		System.out.println(map);
		
		Map<String, Integer> m1 = sortByValues(map);
		System.out.println(m1);
		
	}

	private static Map<String, Integer> sortByValues(Map<String, Integer> map) {
		Comparator<String> comparator = new Comparator<String>() {
			public int compare(String key1, String key2) {
				return map.get(key1).compareTo(map.get(key2));
			}
		};
		Map<String, Integer> m1 = new TreeMap<>(comparator);
		m1.putAll(map);
		return m1;
	}
}
