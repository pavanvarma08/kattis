package kattis;

import java.util.Scanner;

import kattis.compass;

public class carrots {
	
	
	carrots(){	
		System.out.println("3");
		int a =3;
		int b=4;	
	}
	
	

	public static void summ(){
		System.out.println("3");
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		carrots c = new carrots(2,3);
		summ();
		sc.nextInt();
		System.out.println(sc.nextInt());
		//sc.close();
	}
	
	carrots(int a, int b)
	{
		int sum = a+b;
		System.out.println(sum);		
	}
	

	
}
