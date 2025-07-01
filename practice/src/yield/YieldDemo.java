package yield;

public class YieldDemo {

	public static void main(String[] args) {
		Mythread t = new Mythread();
		t.start();
		for (int i = 1; i <= 10; i++) {
			System.out.println("Main Thread");
		}

	}

}
