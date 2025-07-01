package practice;

import java.util.Scanner;
import java.util.Stack;

public class Paranthesis {

	public static void main(String[] args) {
	
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the paranthesis");
		String s = input.nextLine();
		int l = s.length();
		Stack s1 = new Stack();
		if(l%2==0) {
			int i;
			char c ;
			for(i=0;i<l;i++) {
				c = s.charAt(i);
				if(c=='(')
				{
					s1.add(c);
					
			}
				else if(!s1.isEmpty() && s1.pop().equals('(')) {
					s1.pop();
				}
			}
				if(s1.isEmpty())
				{
					System.out.println("Valid Paranthesis");
				}
				else {
					System.out.println("invalid paranthesis");
					return ;
					
				}
			
		}
		
		else {
			System.out.println("Final Not valid Paranthesis");
		}
		
		

	}

	

}
