package oops_concept;

//abstraction
abstract class A{
	int x=10;
	public abstract void meth1();
}
class B extends A{
	public void meth1() {
		System.out.println("Method 1 is implemented throught abstraction");
		System.out.println(super.x);
	}
}

//encapsulation
class C{
	private int m;
	public void setm(int n) {
		m=n;
		//System.out.println(n);
	}
	public int getm() {
		return m;
	}
}

//polymorphism
class D{
	public void meth2(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void meth2(int a) {
		//a=10;
		System.out.println(a);
	}
	public void meth2() {
		int a=19,b=20;
		System.out.println(b-a);
	}
}

//interface
interface E{
	void meth3();
}
interface F{
	void meth4();
}
class I implements E,F{
	public void meth3() {
		System.out.println("Method 3 is executed");
	}
	public void meth4() {
		System.out.println("Method 4 is executed");
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Abstraction");
		A a=new B();
		a.meth1();
		
		System.out.println("\nEncapsulation");
		C c=new C();
		c.setm(5);
		System.out.println(c.getm());
		
		System.out.println("\nPolymorphism");
		D d=new D();
		d.meth2(5,6);
		d.meth2(1);
		d.meth2();
	
		System.out.println("\nInterface");
		I i=new I();
		i.meth3();
		i.meth4();

	}

}
