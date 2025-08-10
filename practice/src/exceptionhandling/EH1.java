package exceptionhandling;

import java.util.Scanner;

public class EH1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		try {
			int result = n1 / n2;
			System.out.println("result of division is " + result);

		} catch (ArithmeticException e) {
			System.out.println("division with zero exception");
		}
	}

}
