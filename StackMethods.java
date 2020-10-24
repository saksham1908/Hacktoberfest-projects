package Stacks;

public class StackMethods {
	int Stack[] = new int[20];
	int top = -1;
	int length = Stack.length;
	public void push(int ele) {
		if(top != length-1) {
			top +=1;
			Stack[top] =  ele;
		}
		else {
			System.out.println("Overflow");
		}
	}
	public void show() {
		for(int i = 0; i < Stack.length; i++) {
			System.out.println(Stack[i]);	
		}
		System.out.println("Top of the array is: " + top);
	}
	public int pop() {
		int data = Stack[top];
		Stack[top] = 0;
		top-=1;
		return data;
	}
	public int peak() {
		int peak = 0;
		for(int i = 0; i< Stack.length; i++) {
			if(Stack[i]!=0)
				peak = Stack[i];
			else
				break;
		}
		return peak;
	}
}
