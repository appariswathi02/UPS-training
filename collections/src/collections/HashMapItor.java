package collections;
import java.util.*;

public class HashMapItor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hs=new HashMap<>();
		HashMap<Integer,String> hs1=new HashMap<>();
		hs.put(1, "a");
		hs.put(2, "b");
		hs.put(3, "c");
		hs1.put(1, "d");
		hs1.put(2,"e");
		hs1.put(4,"r");
		hs.putAll(hs1);
		
		for(Map.Entry<Integer,String> i:hs.entrySet()) {
			System.out.println("KEY:"+i.getKey()+" "+"Value:"+i.getValue());
		}
	}

}
