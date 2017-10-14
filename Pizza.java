package kattis;

import java.util.Scanner;

public class Pizza {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		int count = sc.nextInt();	
		while(count > 0)
		{
			int column = sc.nextInt();
			int row = sc.nextInt();	
			int[][] grid = new int[row][column];		
			for(int i=0; i< row; i++)
				for(int j=0; j< column; j++)
					grid[i][j] = sc.nextInt();
				
			int temp = 0;		
			for(int i=0; i< row; i++)
				for(int j=0; j< column; j++)
				{
					int cost=0;
					outerloop:
					for(int k=0;k<row;k++)	
					  {
						for(int l=0;l<column;l++)
						{
						  int distance= Math.abs(i-k)+Math.abs(j-l);
						  cost += distance * grid[k][l];
						  if(cost > temp && temp>0)
							  break outerloop;
						}	
					  }
					if((temp > cost) || (temp == 0))
						temp= cost;		
				}
			System.out.println(temp+" blocks");		
			count --;
		}	
	}
}
