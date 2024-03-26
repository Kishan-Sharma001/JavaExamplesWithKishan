package ConditionTut;

import java.util.Scanner;

public class DoWhileTut {

	public DoWhileTut() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the No of iteration: ");
		int n= sc.nextInt();
		
		
		int i=1;
		
		do{
			
			System.out.println("*");
			i++;
		}while(i<=n);
		
		sc.close();

	}

}
