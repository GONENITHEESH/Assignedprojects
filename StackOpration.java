package stack;
import java.io.*;
import java.util.*;
public class StackOpration {
	
		public static void main(String[] args)
		{ // Creating an empty Stack
	        Stack<String> stack = new Stack<String>();
	        
	        // Use push() to add elements into the Stack
	        stack.push("india");
	        stack.push("africa");
	        stack.push("japan");
	        stack.push("china");
	        stack.push("america");
	        stack.push("korea");
	        stack.push("srilanka");
	        stack.push("nepal");
	        stack.push("canada");
	        stack.push("france");
	        // Displaying the Stack
	        System.out.println("Initial Stack: " + stack);
	        System.out.println("Popped element: "+ stack.pop());
	        System.out.println("Popped element: "+ stack.pop());
	        System.out.println("Popped element: "+ stack.pop());
	        stack.push("banana");
	        stack.push("orange");
	        stack.push("kiwi");
	        stack.push("jackfruit");
	        // Fetching the element at the head of the Stack
	        System.out.println("The element at the top of the"+ " stack is: " + stack.peek());
	        System.out.println("Popped element: "+ stack.pop());
	        System.out.println("Popped element: "+ stack.pop());
	        System.out.println("Popped element: "+ stack.pop());
	        System.out.println("Popped element: "+ stack.pop());
	        System.out.println("serach element:"+ stack.search("india"));
	        System.out.println("serach element:"+ stack.search("canada"));
	    }
	   


}
