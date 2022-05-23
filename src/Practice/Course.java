package Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class Course 
{

public static void main(String[] args)
{
	
	
	ArrayList<Integer> nums=new ArrayList<>();
	nums.add(10);
	nums.add(20);
	nums.add(30);
	
	
	
	
	/*for(int index=0;index < nums.size();index++)
	{
		
		System.out.println(nums.get(index));
		
	}
	
	
	for(int c:nums)
	{
		System.out.println(c);
	}
	nums.add(3, 40);
	nums.remove(2);
	*/
	
	
	
	
	Iterator<Integer> ci=nums.iterator();
	/*
	while(ci.hasNext())
	{
		Integer c=ci.next();
		System.out.println(c);
	}
	*/
	System.out.println(nums.get(0));
	System.out.println(nums.get(1));
	System.out.println(nums.get(2));
	if(nums.get(1)==20)
	{
		System.out.println(ci.next());
	}
	
}
}
