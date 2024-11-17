package collections;

import java.util.*;
//import java.util.Map.Entry;
public class ReverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(5);
		//Iterator<Integer> i=l.iterator();
		Collections.reverse(l);
		System.out.println(l);
		Set<Integer> s=new HashSet<>(l);
		System.out.println(s);
		List<Integer> l2=new ArrayList<>();
		l2.add(5);
		l2.add(1);
		l2.add(4);
		l2.add(9);
		l2.add(9);
//		l.retainAll(l2);
//		System.out.println(l);
		for(Integer i:l) {
			if(l2.contains(i)) {
				System.out.println(i);
			}
		}
		System.out.print("SecondLargest in the list:");
		Collections.sort(l2);
		System.out.println(l2.get(l2.size()-1));
		System.out.println("Finding frequency of the list:");
		List<String> l3=new ArrayList<>();
		l3.add("swathi");
		l3.add("chopps");
		l3.add("muthu");
		l3.add("suji");
		l3.add("swathi");
		l3.add("chopsss");
		l3.add("swathi");
		HashMap<String,Integer> freq=new HashMap<>();
		for(String str:l3) {
			if(freq.containsKey(str)) {
				freq.put(str, freq.get(str)+1);
			}
			else {
				freq.put(str, 1);
			}
		}
		for(Map.Entry<String, Integer> m:freq.entrySet()) {
			System.out.println("KEY:"+m.getKey()+" "+"Values:"+m.getValue());
		}
		Collections.sort(l3);
		System.out.println(l3);
		
		
		List<Integer> l4=new ArrayList<>();
		l4.add(1);
		l4.add(2);
		l4.add(3);
		l4.add(4);
		l4.add(5);
		l4.add(5);
		Collections.shuffle(l4);
		System.out.println("Elemnts shuffle is:"+l4);
	}

}
