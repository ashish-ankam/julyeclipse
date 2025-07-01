package practice;

public class BSort {

	public static void main(String[] args) {
		int[] ar = {33,23,65,34,90};
		int temp;
		for(int i = 0; i< ar.length; i++) {
			for(int j= 1 ; j< ar.length-i;j++) {
				if(ar[j]>ar[j-1]) {
					temp = ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		
		for(int el : ar) {
			System.out.println(el);
		}
	}

}
