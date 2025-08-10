package exceptionhandling;

public class EH3 {

	
	int disp() {
		
		try {
			System.out.println("method started");
			return 10;
		}
		finally{
			System.out.println("Inside Finally");
		}
		
	}
	public static void main(String[] args) {
		
		EH3 e = new EH3();
		 e.disp();
		
		

	}

}
