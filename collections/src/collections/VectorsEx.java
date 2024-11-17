package collections;
import java.util.Vector;

public class VectorsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v=new Vector<>();
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(80);
		v.addElement(40);
		v.insertElementAt(60,2);
		v.removeElement(40);
		for(int i:v) {
			System.out.println(i);
		}

	}

}
