package oops_concept;

class ClassA{
	public void a() {
		System.out.println("Method a from class A is implemented");
	}
}
class ClassB extends ClassA{
	public void a() {
		System.out.println("Method a from class B is implemented");
	}
}

public class OverridingEx {
	public static void main(String args[]) {
		ClassA obja=new ClassB();
		//ClassB objb=new ClassB();
		//obja.a();
		obja.a();
		System.out.println(obja instanceof ClassB);
		System.out.println(obja instanceof ClassA);
	}
}
