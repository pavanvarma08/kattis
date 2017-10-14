package kattis;

import java.util.Scanner;

public class Winning{
	
	static int count=0;
	static int counter=0;
	
	static String[] exceptionalCases = new String [100] ;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine())
		{
		int games= sc.nextInt();
		double winProbability = sc.nextDouble();
		String testCase = "L";
		//String lastCase = "W";
		for (int i=0; i<games-1; i++)
		{
			testCase = testCase + "L";
			//lastCase = lastCase + "W";
		}
		
		
		String[] allCases= new String[(int) Math.pow(2, games)]; //
		//allCases[0]= testCase;
		//allCases[1]= lastCase;
		int list=0;
		casing(testCase,0,allCases);
			while(list< counter)
			{	
				
				//System.out.println("EXCEPTION "+list+ " "); // exceptionalCases[list]);
				//System.out.println(exceptionalCases[list]+" "+ exceptionalCases[list].lastIndexOf('W')+" "+allCases);
				casing(exceptionalCases[list],exceptionalCases[list].lastIndexOf('W')+1,allCases);
				list++;
				
			}	
			

			System.out.println("out "+count);
			
			int total=0;
			
			double climax=0.0;
			
			for(int i=0;i<count;i++)
			{
				double mult =1.0;
				int dt=0;
				int cnt=0;
				System.out.print("count: "+i+" "+allCases[i]);
				for(int j=0;j<allCases[i].length();j++)
				{
					if(allCases[i].charAt(j)=='L')
					{
					mult = mult*(1-winProbability);
					cnt=0;
					}
					else if(allCases[i].charAt(j)=='W')
					{
						cnt++;
						if(cnt>dt)
							dt=cnt;
						mult= mult*winProbability;
					}
					else
						System.out.println("VERY BADDDDDDD");
					
				}
				System.out.print( " "+ mult + " "+ dt);
				System.out.println(" ");
				 climax= climax + (mult*dt);
			}
			System.out.println(climax);
	}//while
	}//main
	
	
	public static void casing(String testCase, int index, String[] allCases){
		int length = testCase.length();
		String newCase = "";
		String otherCase =testCase;
		//System.out.println("len: "+length+" index: "+index);
		for(int m=index; m<length+1;m++){
		//	System.out.println("m value is "+m);
			
			if(m==0)
				otherCase = testCase; 
			else
			otherCase= otherCase.substring(0, m-1)+"W"+otherCase.substring(m);	
			allCases[count]=otherCase;                                         //System.out.println("main "+allCases[count]);
			count++;
			for(int i=m+1; i<length;i++){	
				newCase = otherCase.substring(0, i)+"W"+otherCase.substring(i+1);
				allCases[count]=newCase; count++; // System.out.println("sub-main:"+allCases[count]);
				for(int j=i+1;j<length;j++){
					String news = newCase.substring(0, j)+"W"+newCase.substring(j+1);
					
					if(news.charAt(0)=='L' && news.charAt(length-1)=='L'){		
						exceptionalCases[counter] = news; counter++;                       //System.out.println("2:  "+ news);
					}		
					
					else
					{
						allCases[count]=news;                                         // System.out.println(allCases[count]);
						count++;	
					}
						
				}// inner for
			}// outer for
		}
		
		
	}
		
		
	
}// class