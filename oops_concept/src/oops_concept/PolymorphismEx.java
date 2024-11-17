package oops_concept;

class Maths{
	public void a(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void a(final int a){
		//a=11;
		int c=10;
		if(c>a) {
			System.out.println(c);
		}
		else {
			System.out.println(a);
		}
	}
}

public class PolymorphismEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths m=new Maths();
		m.a(10,20);
		m.a(9);
	}

}
