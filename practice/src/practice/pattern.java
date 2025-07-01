package practice;

public class pattern {

	public static void main(String[] args) {
	int n =11;
	int i,j;
	for(i=0;i<n;i++) {
		for(j=0;j<n;j++) {
			
			if((i==0 && j>0 && j<(3*n)/4) || (i>0 && j==0 && i< n-1 ) || (i==(n-1) && j>0 && j<(3*n)/4) || ((i> (n-1)/4) && j==(n-1)) ) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	

	}

}
