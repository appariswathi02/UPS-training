package generics;

public class Box<T> {
	private T data;
	public void additems(T data) {
		this.data=data;
	}
	public T getitem() {
		return data;
	}
	public static void main(String args[]) {
		Box<Integer> obj=new Box<>();
		obj.additems(10);
		obj.additems(20);
		System.out.println(obj.getitem());
		Box<String> objs=new Box<>();
		objs.additems("Swathi");
		objs.additems("Chops");
		System.out.println(obj.getitem());
		//System.out.println(objs);
		
	}
}
