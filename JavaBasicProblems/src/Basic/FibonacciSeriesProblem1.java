package Basic;

public class FibonacciSeriesProblem1 {

	/*
	 * *In fibonacci series, next number is the sum of previous two numbers for
	 * example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. The first two numbers of
	 * fibonacci series are 0 and 1 
	 * This can ne done in two ways -
	 * 1.using recursion 
	 * 2.Without Recursion
	 * 
	 * in this example we will solve the problem with second method .
	 * 
	 * 
	 * 
	 */

	


	public FibonacciSeriesProblem1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
		
		int n1=0,n2=1;
		int count =10;
		
		System.out.print(n1+" "+n2);
		
		
		for(int i=2;i<=count;i++) {
			
			int n3 =n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			
		}

	}

}
