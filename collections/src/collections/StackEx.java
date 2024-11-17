package collections;
import java.util.*;

class StackEx{   
 static void stackpush(Stack<Integer> stack)
 {
     for(int i=0;i<5;i++)
     {
         stack.push(i);
     }
 }
 static void stackpop(Stack<Integer> stack)
 {
     System.out.println("Pop Operation:");
     for(int i=0;i<5;i++)
     {
         Integer y = (Integer) stack.pop();
         System.out.println(y);
     }
 }
 static void stackpeek(Stack<Integer> stack)
 {
     Integer element = (Integer) stack.peek();
     System.out.println("Element on stack top:"+element);
 }
 static void stack_search(Stack<Integer> stack, int element)
 {
     Integer pos = (Integer) stack.search(element);

     if(pos == -1)
         System.out.println("Element not found");
     else
         System.out.println("Element is found at position:"+pos);
 }


 public static void main (String[] args)
 {
     Stack<Integer> stack = new Stack<Integer>();

     stackpush(stack);
     stackpop(stack);
     stackpush(stack);
     stackpeek(stack);
     stack_search(stack, 2);
     stack_search(stack, 6);
 }
}
