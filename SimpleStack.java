import java.util.Stack;

public class SimpleStack {
    public static void main(String[] args) {

        // Create a stack of integers

        Stack<Integer> stack = new Stack<>();

        // Push elements

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack after pushes: " + stack);

        // Pop an element

        int popped = stack.pop();

        System.out.println("Popped element: " + popped);

        // Check if stack is empty

        if (stack.isEmpty()) {

            System.out.println("Stack is empty.");

        } else {

            System.out.println("Stack is not empty.");
        }

        // Print current stack

        System.out.println("Current stack: " + stack);
    }
} 
    

