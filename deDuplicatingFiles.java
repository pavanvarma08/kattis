package kattis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class deDuplicatingFiles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		while(sc.hasNextLine())
		{
			int count = sc.nextInt();
			sc.nextLine();
			if(count ==0) break;
			byte[] xorTable = new byte[count];
			String[] files = new String[count];
			int k=0;
			while(count >0)
			{
				String s = sc.nextLine();
				files[k]=s;
			    byte xor= '0';     
				for(int i=0; i<s.length();i++)
					xor ^=  s.charAt(i); 
				xorTable[k]=xor;
				k = k+1;	
				count--;
			}
			
			
			String[] unique = Arrays.stream(files).distinct().toArray(String[]::new);
			
			int collisions=0;
			for(int i=0; i<xorTable.length-1;i++)
			{
				for(int j =i+1; j<xorTable.length;j++)
				{
					if(xorTable[i] == xorTable[j])
					{
						if(files[i].equals(files[j])) continue;
						collisions++;
					}
				}
			}
			System.out.println(unique.length+" "+collisions);
		}			
	}

}
