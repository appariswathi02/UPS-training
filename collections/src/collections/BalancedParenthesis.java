package collections;
import java.util.Stack;

public class BalancedParenthesis {
	public static boolean balance(String str) {
		Stack<Character> st=new Stack<>();
		for(char ch:str.toCharArray()) {
			if(ch=='[' || ch=='(' || ch=='{') {
				st.push(ch);
			}
			else if(ch==']' || ch==')' || ch=='}') {
				if(st.isEmpty()) {
					return false;
				}
			
			char top=st.pop();
			if((ch==')' && top!='(' || ch==']' && top!='[' || ch=='}' && top!='{')){
				return false;
			}
			}
		}
		return st.isEmpty();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="{[()]}";
		System.out.println(balance(str));

	}

}
