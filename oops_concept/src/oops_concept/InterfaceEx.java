package oops_concept;

interface IE{
	void meth3();
}
interface IF{
	void meth4();
}
class II implements IE,IF{
	public void meth3() {
		System.out.println("Method 3 is executed");
	}
	public void meth4(
			) {
		System.out.println("Method 4 is executed");
	}
}

class InterfaceEx{
	public static void main(String args[]) {
	System.out.println("Interface");
	II i=new II();
	i.meth3();
	i.meth4();
	}
}
