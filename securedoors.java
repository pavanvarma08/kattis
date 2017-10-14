package kattis;

import java.util.ArrayList;
import java.util.Scanner;

public class securedoors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		ArrayList<String> log = new ArrayList<String>();
		
		while(a>0)
		{
			String action= sc.next();
			String name= sc.next();
			if(action.equals("entry"))
			{
				if(log.contains(name))
				{
					System.out.println(name+ " entered (ANOMALY)");
				}
				else
				{
					log.add(name);
					System.out.println(name+ " entered");
				}
			}
			
			if(action.equals("exit"))
			{
				if(log.contains(name))
				{
					log.remove(name);
					System.out.println(name+ " exited");
				}
				else
				{
					System.out.println(name+ " exited (ANOMALY)");
				}
				
			}
			a--;
		}
		}	

}
