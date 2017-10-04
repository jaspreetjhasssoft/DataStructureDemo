package ds;

public class Queue {

	private int[] input;
	private int queueSize;
	private int front;
	private int rear;
	
	public Queue() {
		
		queueSize = 1;
		input = new int[queueSize];
		front = -1;
		rear = -1;
		
	}
	
	public void push(int item)
	{
		if(front >= queueSize - 1 )
			resize();
		input[++front] = item;
	}
	
	public Integer pop()
	{
		if(rear >= front)
			return null;
		
		return input[++rear]; 
		
	}
	
	public void resize()
	{
		int[] temp = input;
		queueSize = queueSize * 2;
		input = new int[queueSize];
		
		for(int i=0;i<=front;i++)
			input[i] = temp[i];
		
	}
	
	
}
