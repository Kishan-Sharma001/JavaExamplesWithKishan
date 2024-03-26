package HandlingExamples;

public class Example102 {

	public Example102() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String []args) {
		
		
		try{int[] age= {10,20,30,40};
		
		
		System.out.println(age[5]);
		
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("array size is less");
		}
		
		
		
		System.out.println("Rest off code...");
	}

}
