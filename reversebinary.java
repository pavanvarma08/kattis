package kattis;

import java.util.Scanner;

public class reversebinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		String binary = Integer.toBinaryString(a);
		StringBuffer binaryrev = new StringBuffer(binary) ;
		binaryrev.reverse();
		System.out.println(Integer.parseInt(binaryrev.toString(),2));
		
	}
}
