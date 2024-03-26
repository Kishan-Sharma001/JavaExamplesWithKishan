package HandlingExamples;

import java.io.IOException;

public class Example3 {

	public Example3() {
		// TODO Auto-generated constructor stub
	}
	
	public static void method() throws IOException{
		
//		int a =10/0;
		throw new IOException("can't divide by zero");
	}
	
	public static void main(String []args) {
		
		{
			try {
				method();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}

}
