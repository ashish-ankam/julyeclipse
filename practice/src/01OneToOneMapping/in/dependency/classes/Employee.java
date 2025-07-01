package in.dependency.classes;

public class Employee {
  private String emid;
  private String ename;
  private String eaddr;
  Account account;
  
  
public Employee(String emid, String ename, String eaddr, Account account) {
	super();
	this.emid = emid;
	this.ename = ename;
	this.eaddr = eaddr;
	this.account = account;
}
  

public void getEmployeeDetails() {
	
	System.out.println("Employee Details are :: ");
	System.out.println("EMPID :: " + emid);
	System.out.println("EMPNAME :: " + ename);
	System.out.println("EMPADDR :: " + eaddr);
	System.out.println("-----------------------");
	System.out.println("ACCOUNT Details are :: ");
	System.out.println("ACCOUNT NO :: " + account.accNo);
	System.out.println("ACCOUNT NAME :: " + account.accName);
	System.out.println("ACCOUNT TYPE :: " + account.accType);
	
}
  
  
  
  
}
