package map.methods;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Compute {

	@Test
	/**
	 * To fetch a value from map, do some calculations on it and put it back (under the same key)
	 * 
	 * **/
	public void compute() {
		// Data
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);

		/*System.out.println(map.compute("A", (k, v) -> v == null ? 50 : 100));
		System.out.println(map);

		System.out.println(map.compute("A", (k, v) -> {
			v = 10;
			k = "F";// No effect
			return v;

		}));
		System.out.println(map);

		System.out.println(map.compute("X", (k, v) -> v == null ? 42 : v + 41));// X=42
																				// Added
		System.out.println(map);*/

		int v1 = 88;
		int v2 = 99;

		/*String key = "A";
		map.compute(key, (k, y) -> v2);
		System.out.println(map);*/
		
		String key2 = "A2";
		/**This will MODIFY value if key is present**/
		/**	  AND	**/
		/**This will ADD a new key & value if key is absent**/
		map.compute(key2, (k, y) -> v2);/**This will modify value if key is present**/
		System.out.println(map);

	}
	
	@Test
	public void computeIfAbsent(){
		
		/*Map<String, Boolean> whoLetDogsOut = new HashMap<>();
        whoLetDogsOut.computeIfAbsent("snoop", k -> f(k));
        whoLetDogsOut.computeIfAbsent("snoop", String::isEmpty);//Won't enter here!
		System.out.println(whoLetDogsOut);*/
		
		
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		int v1 = 88;
		int v2= 99;
		
		String key = "A";
		map.computeIfAbsent(key, k -> v2);
		System.out.println(map);
	}
	
	static boolean f(String s) {
        System.out.println("creating a value for \""+s+'"');
        return s.isEmpty();
    }
}
