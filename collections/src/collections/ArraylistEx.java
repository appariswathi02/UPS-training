package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArraylistEx {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(10);
        num.add(20);
        num.add(90);
        num.add(80);
        num.add(50);
        num.add(70);
        Iterator<Integer> i=num.iterator();
        while(i.hasNext()) {
        	System.out.println(i.next());
        }
//        System.out.println("GET "+num.get(3));
//        System.out.println("REMOVE "+num.remove(0));
//        System.out.println("INDEXOF "+num.indexOf(3));
//        System.out.println("SET :"+num.set(2, 80));
//        System.out.println("ArrayList is:");
//        for(int n:num) {
//        	System.out.print(n+" ");
//        }
//        System.out.println(num);
    }
}

