package ConditionTut;

import java.util.Scanner;

public class IfTut {
	
	

	public static void main(String []args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Your Age :");
		int age =sc.nextInt();
		
		if( age>=18) {
			System.out.println("You are eligible to Vote");
		
		}
		else
		{
			System.out.println("You are not eligible to Vote");
		}
		
		sc.close();
		
	}

}
