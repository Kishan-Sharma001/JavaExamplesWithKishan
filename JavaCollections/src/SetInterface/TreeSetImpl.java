package SetInterface;

import java.util.TreeSet;

public class TreeSetImpl {

	public TreeSetImpl() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Banana");
		ts.add("Apple");
		ts.add("Orange");
		ts.add("Papaya");
		
		
		for (String fruits:ts) {
			System.out.println(fruits);
		}

	}

}
