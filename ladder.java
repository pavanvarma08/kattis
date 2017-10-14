package kattis;

import java.util.Scanner;

public class ladder {
	public static void main(String[] args) {	
		   Scanner sc = new Scanner(System.in);	   
		   int height = sc.nextInt();
		   int angle = sc.nextInt();
		   double radians = Math.toRadians(angle);
		   double ladder_height = height/ (Math.sin(radians)) ;
		   int roundedup_height = (int) Math.ceil(ladder_height);
		   System.out.println(roundedup_height );	   
	}
}
