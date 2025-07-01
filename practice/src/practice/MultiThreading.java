package practice;

public class MultiThreading extends Thread{

	public static void main(String[] args) {
		MultiThreading mt = new MultiThreading();
		mt.setPriority(MAX_PRIORITY);
		mt.setName("mt");
		mt.start();
		
		MultiThreading mt1 = new MultiThreading();
		mt1.setPriority(MIN_PRIORITY);
		mt1.setName("mt1");
		mt1.start();
	}
	public void run() {
		System.out.println("Thread Name: " + Thread.currentThread().getName());
	}

}
