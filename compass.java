package kattis;

import java.util.Scanner;

public class compass {

	public static void main(String[] args) {
		
		//public void print();
		carrots z= new carrots();
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();		
		if(a>b)
		{
			int x = b - a;
			int y = 360 - Math.abs(x);
			if(Math.abs(x) < Math.abs(y))
			{
				System.out.println(x);
			}
			else
				System.out.println(y);			
		}
		if (a<=b)
		{
			int x = b - a;
			int y = x - 360;
			if(Math.abs(x) <= Math.abs(y))
			{
				System.out.println(x);
			}
			else
				System.out.println(y);
			
		}
		
	}

}
	
