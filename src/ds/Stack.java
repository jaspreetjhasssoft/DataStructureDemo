package ds;

public class Stack {

	int[] input ;
	int top;
	int stackSize;
	
	public Stack() {
		
		top = -1;
		stackSize = 1;
		input = new int[stackSize];
		
	}
	
	
	public void push(int item)
	{
		if(top >= stackSize - 1)
			resize();
		
			input[++top] = item;
			
	}
	
	public Integer pop()
	{
		if(top<0)
			return null;
		return input[top--];
		
	}
	
	public void resize()
	{
		int[] temp = input;
		stackSize = stackSize *2;
		input = new int[stackSize];
		for(int i=0;i<=top;i++)
		{
			
			input[i] = temp[i];
		}
		
	}
	
}
