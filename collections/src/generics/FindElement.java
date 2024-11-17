package generics;

import java.util.List;
public class FindElement {
	public static <T> int findelement(List<T> l,T t) {
		for(int i=0;i<l.size();i++) {
			if(l.get(i).equals(t)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ln=List.of(2,3,4,5);
		System.out.println(findelement(ln,3));
	}

}
