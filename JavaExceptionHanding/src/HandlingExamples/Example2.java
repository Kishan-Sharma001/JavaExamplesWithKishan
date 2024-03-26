package HandlingExamples;

public class Example2 {

	public Example2() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public static void method() {
	
		try{
			int age =10/0;
		}
		catch(ArithmeticException e) {
			System.out.println("you can't divide a no by zero");
		}
		

		
	}
	
	public static void main(String []args) {
		
		method();
	}

}
