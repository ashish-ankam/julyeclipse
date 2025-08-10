package exceptionhandling;

import java.util.Scanner;

public class EH2ATM extends EH2Bank {
	public void atmWithdrawal() throws CustomException1 {
		Scanner sc = new Scanner(System.in);

		//System.out.println("Hello Welcome to the Banks ATM");

		System.out.println("Please enter your UserID and Password to continue");

		String userID;
		String password;
		userID = sc.nextLine();
		password = sc.nextLine();

		if ((userID == EH2Bank.userID) && (password == EH2Bank.userPassword)) {
			System.out.println("Congratulations Login Successfull");
		}

		else {

			CustomException1 ce = new CustomException1("its wrong input please enter correct details and Try Again");

			throw ce;
		}

	}

}
