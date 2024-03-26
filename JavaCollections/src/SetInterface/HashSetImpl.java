package SetInterface;

import java.util.HashSet;

public class HashSetImpl {

	public HashSetImpl() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		set.add("Black");
		set.add("Green");
		set.add("Red");
		set.add("Yellow");
		
		for(String colors:set) {
			System.out.println(colors);
		}
		
		

	}

}
