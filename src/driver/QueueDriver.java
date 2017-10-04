package driver;

import ds.Queue;

public class QueueDriver {

	public static void main(String[] args) {
		
		Queue queue  =  new Queue();
		
		queue.push(23);
		queue.push(11);
		queue.push(90);
		queue.push(78);
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		queue.push(1920);
		queue.push(770);
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
	}
	
}
