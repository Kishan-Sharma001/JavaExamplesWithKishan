package trianglePattern;

//import java.util.Scanner;

public class increasingTriangle {
	
	public static void pattern(int n) {
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter A Number");
		//int n= sc.nextInt();
		
		
		int i ,j;
		for (i=1;i<=n;i++) {
			for (j=i;j<=n;j++) {
				System.out.print("* ");
			}
			
			
			
			
			
			
			System.out.println(" ");
		}
		
	}
	
	public static void main (String [] args) {
		
		pattern(5);
		
	}
	
	
}
