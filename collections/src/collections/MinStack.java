package collections;

import java.util.Stack;
public class MinStack {
    int min = Integer.MAX_VALUE;

        Stack<Integer> stack = new Stack<>();


        public  void push(int x) {
            // When the new value is less than or equal to the current minimum,
            // push the old minimum value onto the stack first
            if (x <= min) {
                stack.push(min);
                min = x;  // Update the current minimum
            }
            stack.push(x);  // Push the new value
        }

        // Pop method
        public   void pop() {
            // If the top element is the current minimum, pop twice:
            // first to remove the current value, and second to restore the previous minimum
            if (stack.pop() == min) {
                min = stack.pop();
            }
        }

        // Top method to return the top element
        public  int top() {
            return stack.peek();
        }

        // GetMin method to return the current minimum element
        public   int getMin() {
            return min;
        }

        public static void main(String[] args) {
            MinStack minStack = new MinStack();

            // Test case 1
            minStack.push(30);
            minStack.push(29);
            minStack.push(18);
            minStack.push(15);
            minStack.push(16);
            System.out.println("Current min: " + minStack.getMin());
            System.out.println("Top element: " + minStack.top());

            // Test case 2
            minStack.pop();
            System.out.println("Top element after pop: " + minStack.top());
            System.out.println("Current min after pop: " + minStack.getMin());

            // Test case 3
            minStack.pop();
            System.out.println("Current min after second pop: " + minStack.getMin());

            
        }
    }
