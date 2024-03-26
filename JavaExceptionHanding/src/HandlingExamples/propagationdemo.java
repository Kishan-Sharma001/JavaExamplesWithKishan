package HandlingExamples;

public class propagationdemo {

	



	public propagationdemo() {
		// TODO Auto-generated constructor stub
	}
	
	public static void m() {
		System.out.println("Hello");
		
		int a=100/0;
		
	}
	
	public static void n() {
		m();
		
	}
	
	public static void p() {
		try {
		n();
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
	}
	
	

	public static void main(String[] args) {
		
		p();
		System.out.println("Rest of Code....");
		

	}

}
