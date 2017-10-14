package kattis;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class GeneticSearch {
	
	public static int logic(String L, String S){
		 int count=0;
		 String sub = L;
		int index= L.indexOf(S) ;
		while(index >= 0){
			count++;
			sub = sub.substring(index+1);
			if(sub.length()< S.length())break;
			index = sub.indexOf(S); 	
		}
		return count;
	}
	
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);	
		while(sc.hasNextLine()){
			String S= sc.next();
			if(S.equals("0")) break;
			String L = sc.next();
			
			System.out.print("\n"+logic(L,S));
			
			HashSet<String> name2=new HashSet<String>(); 
			for(int i=0; i< S.length(); i++)
			{
				 name2.add((S.substring(0, i) + S.substring(i+1)));
			}	
			Iterator<String> itr=name2.iterator();  
			int counter=0;
			while(itr.hasNext()) 
				counter += logic(L,itr.next());
			
			System.out.print(" "+ counter + " ");
			
	      String[] given = { "A" , "G" ,"C" ,"T"};
	      HashSet<String> name3=new HashSet<String>();
	      for(int i =0 ; i<given.length; i++)
	      {
	    	  for(int j=0; j<= S.length(); j++)
	    	  {
	    		  String temp = S.substring(0, j) + given[i] + S.substring(j);
	    		  name3.add(temp);
	    	  }
	      }
	    	  itr=name3.iterator();
	    	    counter=0;	
				while(itr.hasNext()) 
					counter += logic(L,itr.next());   
				System.out.print(counter);  		
		}
		sc.close();
	}
}
