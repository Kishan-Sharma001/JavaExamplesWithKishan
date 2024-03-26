package HandlingExamples;

public class Example1 {

	public Example1() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String []args) {
		
		try {
		int a=100/0;
		}catch(ArithmeticException e) {
			
			System.out.println(e);
		}
		
		System.out.println("This is a exception Handling Example by try catch block");
	}

}
