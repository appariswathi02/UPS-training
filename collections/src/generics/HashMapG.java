package generics;

import java.util.*;
public class HashMapG {
	public static <k,v> void printhash(Map<k,v> m) {
		for(Map.Entry<k, v> i: m.entrySet()) {
			System.out.println("key:"+ i.getKey() +" "+"Value"+i.getValue());
		}
	}
	public static void main(String args[]) {
		Map<String,Integer> m = new HashMap<>();
		m.put("pink",1);
		m.put("orange", 2);
		printhash(m);
	}
}
