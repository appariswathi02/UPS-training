package oops_concept;

class Example {
    static int count = 0; 
    static int num;

    static {
    	num=100;
    	System.out.println("Static block is executes");
    }
    public Example() {
        count++;
    }

    public static void displayCount() {
        System.out.println("Display count:"+count);
        System.out.println("Display num:"+num);
    }
    static class NestedStatic{
    	public void dis() {
    		System.out.println("Nested class is executed");
    	}
    }
    class NestedNonStatic{
    	public void nonstatic() {
    		System.out.println("Nested non static is displayed");
    	}
    }
}

public class StaticEx {
    public static void main(String[] args) {
        Example obj1 = new Example();
        Example obj2 = new Example();
        Example.displayCount();  
        Example.NestedStatic objs=new Example.NestedStatic();
        objs.dis();
        Example.NestedNonStatic objn=obj1.new NestedNonStatic();
        objn.nonstatic();
    }
}

