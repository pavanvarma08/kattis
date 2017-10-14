package kattis;

import java.util.Scanner;

public class DiffentDirections {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x,y,angle,totalX,totalY,avgX,avgY;
		int directions;
		while(sc.hasNextLine()){ 
			x=0;
			y=0;
			angle=0;
			totalX=0;
			totalY=0;
			avgX=0; 
			avgY=0;	
			int count = sc.nextInt();
			if(count == 0)break;
			Double[] firstCoordinate = new Double[count];
			Double[] secondCoordinate = new Double[count];
			directions = count;
			sc.nextLine();
			int k=0;
		  while(count > 0)
		  { 
			  String str= sc.nextLine();
			  String[] row = str.split(" ");  
			  x= Double.parseDouble(row[0]);
			  y= Double.parseDouble(row[1]);
			  angle= Double.parseDouble(row[3]);
			  for(int i=4; i<row.length;i+=2)
			  {
			     if(row[i].equals("walk"))
					  {
						  double walk = Double.parseDouble(row[i+1]);
						  x += Math.cos(Math.toRadians(angle)) * walk;
						  y += Math.sin(Math.toRadians(angle)) * walk; 
					  }
				  if(row[i].equals("turn"))
				  {
					  double turn= Double.parseDouble(row[i+1]);
							 angle = angle + turn;	
				  }
			  }
			  firstCoordinate[k]=x;
			  secondCoordinate[k]=y;
			  totalX += x;
			  totalY += y;
			  k++;
			  count--;
		  } 
		  avgX = totalX/directions; avgY = totalY/directions;  
		  double distance;
		  double worstDistance=0;
		  for(int i=0;i<directions;i++)
		  {
			  double diff1 = avgX - firstCoordinate[i];
			  double diff2 = avgY - secondCoordinate[i];
			  distance = Math.sqrt(Math.pow(diff1, 2) + Math.pow(diff2, 2));
			  if(i==0) {worstDistance = distance; continue;}
			  else
			   if(distance > worstDistance)
			   {
				   worstDistance = distance;
			   }			  
		  }
		  System.out.println(avgX+ " "+avgY+ " "+ worstDistance );	  
		}	
		sc.close();
	}
}
