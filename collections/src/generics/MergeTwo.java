package generics;

import java.util.ArrayList;
import java.util.List;
public class MergeTwo {
	public static <T> List <T> merge(List<T> l1, List<T> l2){
		List<T> result=new ArrayList();
		int maxs=Math.max(l1.size(),l2.size());
		for(int i=0;i<maxs;i++) {
			if(i<l1.size()) {
				result.add(l1.get(i));
			}
			if(i<l2.size()) {
				result.add(l2.get(i));
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1=List.of(1,3,5,7);
		List<Integer> l2=List.of(2,4,6,8);
		System.out.println(merge(l1,l2));

	}

}
