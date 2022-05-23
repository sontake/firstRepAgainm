package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String A=sc.nextLine();
		System.out.println("Enter the value of first string:"+A);
		System.out.println(A);
		
		String P=sc.nextLine();
		System.out.println("Enter the value of second string:"+P);
		System.out.println(P);
		
		ArrayList<String> Ai=new ArrayList<>();
		String one[]=A.split("");
		for(String a:one)
		{
			Ai.add(a);
		}
		
		ArrayList<String> Pi=new ArrayList<>();
		String two[]=P.split("");
		for(String p:two)
		{
			Pi.add(p);
		}
		
		System.out.println(Ai);
		System.out.println(Pi);
		
	
		
		int len=Pi.size();
		int count=0;
		for(int i=0;i<len;i++)
		{
			
			if(Pi.get(i).equals(Ai.get(i)))
			{
				count=count+1;
			}
			
		}
		System.out.println(count);
		
		
			
	}
	
}
