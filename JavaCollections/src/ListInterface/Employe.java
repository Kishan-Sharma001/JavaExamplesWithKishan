package ListInterface;
import java.util.ArrayList;

public class Employe {
	
	int emp_id;
	String name ;
	long phone_no;

	public Employe(int emp_id ,String name, long phone_no) {
		this.emp_id = emp_id;
		this.name = name;
		this.phone_no = phone_no;
	}

	public static void main(String[] args) {
		
		Employe e1 = new Employe(101,"Abhishek", 982311112);
		Employe e2 = new Employe(102,"Karan", 993412217);
		Employe e3 = new Employe(103,"Rohit", 982333991);
		
		ArrayList<Employe> emplist = new ArrayList<Employe> ();
		
		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);

		
		for(Employe emp:emplist) {
			System.out.println(emp.emp_id+" "+emp.name+" "+emp.phone_no);
		}

	}

}
