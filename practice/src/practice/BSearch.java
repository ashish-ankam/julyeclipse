package practice;

import java.util.Arrays;
import java.util.Scanner;

public class BSearch {

	public static void main(String[] args) {
		int[] ar = {12,76,45,36,82,200,300};
		
		int low = 0;
		int high= ar.length-1;
		int key;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key element ");
		key =  sc.nextInt();
		boolean flag=false;
		Arrays.sort(ar);
		
		while(low<=high) {
			int mid= (low+high)/2;
			
			
			if(ar[mid]==key) {
				System.out.println("key found at " + mid);
				flag = true;
				break;
				
			}
			else if(ar[mid]> key) {
				high = mid -1;
				
			}
			else if(ar[mid]< key) {
				
				low = mid +1;
				
			}
			
			
			
		}
		if(flag==false) {
			System.out.println("Key element not found");
		}

	}

}
