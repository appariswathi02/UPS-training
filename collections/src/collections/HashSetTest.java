package collections;

import java.util.*;
public class HashSetTest {
	static HashSet<Integer> hs=new HashSet<>();
	public static void checkin(int id) {
		if(!hs.contains(id)) {
			hs.add(id);
		}
	}
	public static boolean ischeckedin(int id) {
		if(hs.contains(id)) {
			return true;
		}
		return false;
	}
	public static void removecheckin(int id) {
		hs.remove(id);
	}
	public static void display() {
		System.out.println(hs);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkin(1);
		checkin(2);
		checkin(3);
		System.out.println(ischeckedin(1));
		removecheckin(1);
		display();

	}

}
