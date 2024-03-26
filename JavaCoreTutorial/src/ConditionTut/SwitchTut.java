package ConditionTut;

import java.util.Scanner;

public class SwitchTut {

	public SwitchTut() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	
		
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Enter the week day : ");
		
		int a = sc.nextInt();
		
		switch(a){
		case 0  : System.out.println("Sunday");
		break;
		case 1  : System.out.println("Monday");
		break;
		case 2  : System.out.println("Tuesday");
		break;
		case 3  : System.out.println("Wednesday");
		break;
		case 4  : System.out.println("Thursday");
		break;
		case 5  : System.out.println("Friday");
		break;
		case 6  : System.out.println("Saturday");
		break;
		
		}
		
		
		sc.close();

	}

}
