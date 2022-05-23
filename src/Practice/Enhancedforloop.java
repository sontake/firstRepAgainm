package Practice;

public class Enhancedforloop 
{
	
	public int[] marks= {20,50,60,80,90};
	
	public void marks_details()
	{
		
		System.out.println(marks[0]);
	}
	
	public void marks_display()
	{
		
		for(int i:marks)
		{
			System.out.println(i);
			
		}
		
	}
	

public static void main(String[] args)
{
	Enhancedforloop obj=new Enhancedforloop();
	obj.marks_details();
	obj.marks_display();
	
}
}
