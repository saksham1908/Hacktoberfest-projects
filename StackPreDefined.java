package Stacks;
import java.util.Stack;

public class StackPreDefined {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		Stack s1 = new Stack();
		s.push(34);
		s.push(21);
		s.push(32);
		s.push(45);
		s.push(15);
		s.push(5);
		s.push(9);
		System.out.println("Hashcode: " + s.hashCode());
		System.out.println(s);
		System.out.println("Peek of the stack is: " + s.peek());
		System.out.println("Popped element: " + s.pop());
		// System.out.println("Popped element: " + s.pop(32)); - Popping an element directly from stack isn't possible.
		// - Top isn't a predefined thing we have to take it as an assumption.
		System.out.println("Searched element is on the index: " + s.search(32));
		System.out.println("Stack-1 is empty: " + s1.empty());
		System.out.println("Stack is empty: " + s.empty());   
		System.out.println(s);
	}
}
