package driver;

import ds.Stack;



public class StackDriver {

	public static void main(String[] args) {
		
		Stack st = new Stack();
		st.push(10);
		st.push(20);
		st.push(50);
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		st.push(30);
		System.out.println(st.pop());
		
	}
	
}
