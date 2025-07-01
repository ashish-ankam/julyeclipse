package practice;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
	
		
		 int[][] ar=new int[2][3];
		 Scanner sc  = new Scanner(System.in);
		 int rowIndex = 0;
		 for(int[] rows : ar) {
			 for(int cols = 0;cols<rows.length;cols++) {
				 
				 ar[rowIndex][cols] = sc.nextInt();
				 
			 }
			 rowIndex++;
		 }
		 for(int[] rows : ar) {
			 for(int val : rows) {
				 
				System.out.print(val + "  ");
				
				 
			 }
			 System.out.println();
			 System.out.print(" ");
			
		 }

	}

}
