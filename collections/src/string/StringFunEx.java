package string;
import java .util .Scanner;

public class StringFunEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringBuilder str=new StringBuilder("Codecademy");
		//String input=sc.nextLine();
		String s=sc.nextLine();
		//str.append(input);
		System.out.println(str.length());
		System.out.println(str.indexOf("e"));
		System.out.println(str.charAt(1));
		System.out.println(s.concat(" new string"));
		System.out.println(s.equals("Codecademy"));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
        int count=0;
		for(char i:s.toCharArray()) {
			if(i=='A'|| i=='a' || i=='E' || i=='e' || i=='i' || i=='I' || i=='o' || i=='O' || i=='u' ||i=='U' ) {
				count+=1;
			}
			
		}
		System.out.println(count);
	}

}
