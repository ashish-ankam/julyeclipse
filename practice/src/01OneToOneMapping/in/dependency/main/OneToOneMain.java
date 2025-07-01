package in.dependency.main;

import in.dependency.classes.Account;
import in.dependency.classes.Employee;

public class OneToOneMain {

	public static void main(String[] args) {
		
		Account account = new Account("123Ash", "ASHISH", "SAVINGS");
		
		Employee employee = new Employee("ASH189", "ASHISH", "HYD", account);
		
		employee.getEmployeeDetails();

	}

}
