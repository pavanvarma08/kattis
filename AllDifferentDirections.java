package kattis;

import java.util.Scanner;

public class AllDifferentDirections {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);	
		int count = sc.nextInt();
		double avgX=0,avgY=0;
		while(sc.hasNextLine()){
			double x= sc.nextDouble();
			double y= sc.nextDouble();
			double angle =0;
			if(sc.next().equals("start"))
			{		System.out.println("im here");
				angle = sc.nextDouble();
				if(sc.next().equals("walk"))
				{	
					System.out.println("im here also");
				   double z = sc.nextDouble();
				   x += z*Math.cos(Math.toRadians(angle));
				   y += z*Math.sin(Math.toRadians(angle));
				   System.out.println(x+"  "+ y);
				}     
			}
			System.out.println(sc.hasNext());
			while(sc.next().equals("turn"))
			{
				System.out.println("now here");
				double turn = sc.nextDouble();
				if(turn > 0.0)
				 angle = angle + turn;
				else
				 angle = angle - turn;	
				if(sc.next().equals("walk"))
				{	
				   double z = sc.nextDouble();
				   x += z*Math.cos(Math.toRadians(angle));
				   y += z*Math.sin(Math.toRadians(angle));
				}    
				
			}
			System.out.println("out");
		
			 avgX += x;
			 avgY += y;
			
		}
		
		System.out.println((avgX)/count);
		System.out.println((avgY)/count);
	
	}

}
