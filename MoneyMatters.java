package kattis;

import java.util.Scanner;

public class MoneyMatters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int first =sc.nextInt();
		int second = sc.nextInt();
		System.out.println(first+ "  "+second);
		int[] money = new int[first];
		for(int i=0; i<first;i++)
		{
			
			 money[i]=sc.nextInt();
			 System.out.println("i value"+ money[i]);
		}
		int[] a = new int[second];
		int[] b = new int[second];
		int count=0;
		for(int i=0;i<second;i++)
		{
		     a[i] = sc.nextInt();
			 b[i] = sc.nextInt();
			// count+= money[a[i]]+money[b[i]];
			  //System.out.println(count);
		}
		
		int counter=0;
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<b.length; j++)
			{		
				if(a[i] == b[j])
				{	
					counter += money[a[i]];
				}
			}
		}
		
		if(count == counter)
			System.out.println("POSSIBLE");
		else
			System.out.println("IMPOSSIBLE");
		
	}

}
