package kattis;

import java.util.Scanner;



public class different {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);		
		while(sc.hasNextLine())
		{
			long a = sc.nextLong(); 
			long b = sc.nextLong();
		   System.out.println(Math.abs(a-b));
		}
		sc.close();
	}

}
