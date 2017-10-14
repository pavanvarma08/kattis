package kattis;

import java.util.Scanner;

public class DetailedDifferences {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 sc.nextLine();
		while(sc.hasNextLine())
		{
			String first = sc.nextLine();
			String second = sc.nextLine();
			System.out.println(first);
			System.out.println(second);
			
			for(int i=0; i<first.length();i++)
			{	
				if(first.charAt(i) == second.charAt(i))
					System.out.print(".");
				else
					System.out.print("*");
			}
			System.out.println("\n");
		}
		sc.close();

	}

}
