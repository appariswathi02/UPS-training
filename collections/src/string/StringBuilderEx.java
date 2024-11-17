package string;

public class StringBuilderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder();
		sb.append("World");
		sb.insert(0,"Hello ");
		System.out.println(sb);
		
		System.out.println(sb.charAt(3));
				
		System.out.println(sb.replace(2, 4, "hg"));
		
		sb.deleteCharAt(4);
		System.out.println(sb);
		
		System.out.println(sb.reverse());
		
		int cap=sb.capacity();
		System.out.println(cap);
	}

}
