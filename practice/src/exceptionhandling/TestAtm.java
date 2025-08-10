package exceptionhandling;

public class TestAtm {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		EH2ATM atm = new EH2ATM();

		try {
			atm.atmWithdrawal();
		} catch (CustomException1 e) {
			System.out.println(e.getMessage());
			
			try {
				atm.atmWithdrawal();
			} catch (CustomException1 e1) {
				System.out.println(e.getMessage());
				try {
					atm.atmWithdrawal();
				} catch (CustomException1 e11) {
					
					System.out.println("Your attempts exhausted and blocked    ");
					System.exit(0);
					
				}
				
			}
			
		}
	}


}
