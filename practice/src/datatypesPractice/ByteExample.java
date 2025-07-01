package datatypesPractice;

public class ByteExample {

	public static void main(String[] args) {
//		System.out.println("Byte SIZE is " + Byte.SIZE);
//		System.out.println("Byte MIN_VALUE is " + Byte.MIN_VALUE);
//		System.out.println("Byte MAX_VALUE is " + Byte.MAX_VALUE);
		
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a+b);
	    char z = 'a';
	    char y ='b';
	    char x = (char)(z+y);
	    
	    System.out.println("Long MIN_VALUE is " + Long.MIN_VALUE);
	    System.out.println("Long MAX_VALUE  " + Long.MAX_VALUE);
	    
	    System.out.println("Integer MAX_VALUE is " + Integer.MAX_VALUE);
	    long d = 2147483648l;
	    System.out.println(d);
	    
	    System.out.println("Float MAX_VALUE is " + Float.MAX_VALUE);
	    System.out.println("Float MIN_VALUE is " + Float.MIN_VALUE);
	    System.out.println("Double MAX_VALUE is " + Double.MAX_VALUE);
	    System.out.println("Double MIN_VALUE is " + Double.MIN_VALUE);;;;;;;;
	    
	    float f = 1.5f;;;;;;;;;
	    int kk = (int)12.3f;
         int res =2;
         res-=20;
         System.out.println(res);
         
         
	}

}
