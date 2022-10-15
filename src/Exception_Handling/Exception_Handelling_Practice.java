package Exception_Handling;

public class Exception_Handelling_Practice {
	
	public static void main(String[] args) {
		
		System.out.println("Program Started.");
		
		// 1. Arithmatic Exception
//		int a=100; 
//		System.out.println(a/0);
		
		// 2. Null Pointer Exception.
//		String s= null;
//		System.out.println(s.length());
		
		// 3. NumberFormatException
		
//		String s= "abc";
//		int i = Integer.parseInt(s);
//		System.out.println(i);
		
		// 4. ArrayIndexOutOfBoundsException
//		int a[]=new int[5];
//		a[10]=50;
		
		int a=100; 
		String s=null;
		try {
		System.out.println(a/0);
		System.out.println(s.length());
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(a/2);
			//System.out.println("please enter valid data");
		}catch (NullPointerException e1) {
			e1.printStackTrace();
			s="products";
			System.out.println(s.length());
		}
		
		
//		int a =100;
//		String s =null;
//		try {
//		System.out.println(a/2);
//		System.out.println(s.length());
//		}catch(Exception e) {
//			e.printStackTrace();
//			System.out.println("please enter valid data");
//		}finally {
//			System.out.println("This is executing complusorily");
//		}
		
		
		
		
		
		
		System.out.println("Program Finished.");
		
	}

}
