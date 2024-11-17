package collections;

import java.util.Stack;

public class SortStack {
    public static void sortstack(Stack<Integer>stack){
        Stack<Integer>temp=new Stack<>();
        while(!stack.isEmpty()){
            int top=stack.pop();
            while(!temp.isEmpty() && temp.peek() > top){
                stack.push(temp.pop());
            }
            temp.push(top);
        }
        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }
    }
    public static void main(String[]args) {
        Stack<Integer> s = new Stack<>();
        s.push(20);
        s.push(12);
        s.push(10);
        s.push(50);
        s.push(23);
        sortstack(s);
        System.out.println("Sorted Stack " + s);
    }

}