package in.manytoone.main;

import in.manytoone.beans.Branch;
import in.manytoone.beans.Student;

public class ManytoOneMain {

	public static void main(String[] args) {

             Branch branch = new Branch();
             branch.setBid("189");
             branch.setBname("INDIA");
             
             Student s1 = new Student();
             s1.setSid("123");
             s1.setSname("ASHISH");
             s1.setSaddress("HYDERABAD");
             s1.setBranch(branch);
             
             Student s2 = new Student();
             s2.setSid("156");
             s2.setSname("KOHLI");
             s2.setSaddress("PUNJAB");
             s2.setBranch(branch);
             
             Student s3 = new Student();
             s3.setSid("0845");
             s3.setSname("DHONI");
             s3.setSaddress("JHARKHAND");
             s3.setBranch(branch);
             
             Student[] s = new Student[3];
             s[0]=s1;
             s[1]=s2;
             s[2]=s3;
             
             
             
             for(Student ss : s) {
            	 
            	 
             System.out.println("STUDENT DETAILS  ----> ");
             System.out.println("STUDENT ID         :: " + ss.getSid());
             System.out.println("STUDENT NAME       :: " + ss.getSname());
             System.out.println("STUDENT ADDRESS    :: " + ss.getSaddress());
             System.out.println("STUDENT BRANCH ID  :: " + ss.getBranch().getBid());
             System.out.println("STUDENT BRANCH NAME:: " + ss.getBranch().getBname());
             
             }
             
             
             
             

             
             
             
             
             

	}

}
