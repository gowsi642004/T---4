import java.util.Stack;

public class SimpleStack {
    public static void main(String[] args) {

        // Create a stack of integers

        Stack<Integer> stack = new Stack<>();

        
        stack.push(98);
        stack.push(76);
        stack.push(54);
        System.out.println("popped element: " + stack.pop());
        System.out.println("stack check:" + stack.isEmpty());
       
        System.out.println("Stack after pushes: " + stack);
     }

        // Pop an element

        public void popElement (Stack < Integer> stack , Integer number ) {

        if (!stack.isEmpty()) {

            int remove = stack.pop();

        System.out.println("Popped element: " + remove);

        }  else {

            System.out.println("stack is empty");
        }
    }

        // Check if stack is empty

        public void isEmpty (Stack < Integer> stack , Integer number) {

        if (stack.isEmpty()) {

            System.out.println("Stack is empty.");

        } else {

            System.out.println("Stack is not empty.");
        }
    }

       // push a new element 

       public void pushElement (Stack < Integer> stack , Integer number) {

          stack.push(67);
          stack.push(87);
          stack.push(97);

          System.out.println("pushed element =" + number);
       }



}
    

