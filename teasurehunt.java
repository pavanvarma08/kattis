package kattis;

import java.util.Scanner;

public class teasurehunt {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
	    int column = sc.nextInt();
	    int row = sc.nextInt();  
	    int r = 0, c = 0, count =0;
	    boolean flag = false;
	    for(int i=0; i<row; i++)
	    {
	     String str = sc.next();
	    	for(int j=0; j<column; j++)
	    	{
	    		char ch = str.charAt(j);
	    		if (ch == 'N')
	    		{   
	    			r -= 1;
	    			count ++;
	    		}
	    		else if(ch == 'S')
	    		{   
	    			r += 1;
	    			count ++;
	    		}
	    		else if(ch == 'W')
	    		{   
	    			c -= 1;
	    			count ++;
	    		}
	    		else if(ch == 'E')
	    		{   
	    			c += 1;
	    			count ++;
	    		}
	    		else if(ch == 'T')
	    		{   
	    			flag = true;
	    		}		
	    	}
	    }
	    if( (r>=row || c>=column ) || ( r<0 || c<0))
	    	System.out.println("out");
	    else if (!flag)
	    System.out.println("Lost");
	    else
	    System.out.println(count);
	    
	}

}
