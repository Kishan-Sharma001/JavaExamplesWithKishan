package basic;

public class VariableTut {
	
	//1.Static Variable:- defined by static keyword 
	
	static String str="This is string of static type";
	
	//2.instance variable :- defined inside the class but outside the method body
	
	int a=10;
	
	
	public void run(String st) {
		
		//3. local variable
		String local= "This is local variable defined inside the method ";
		
		System.out.println("Local Variable :"+local);
		System.out.println("Static Variable :"+st);
		
	}

public static void main(String [] args) {
	
	VariableTut var =new VariableTut();
	
	var.run(str);
	
	
}

}
