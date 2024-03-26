package ListInterface;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListImpl {

	public ArrayListImpl() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
		ArrayList <String> list = new ArrayList<String> ();
		list.add("Ankit");
		list.add("babu");
		list.add("Chetan");
		list.add("Nikhil");
		
		Iterator<String> it = list.iterator();
		
		while (it.hasNext()) {
		System.out.println(it.next());
		}
		
		list.remove(2);
		
		System.out.println("Remove method using for Each loop iteratoration");
		
		for(String name:list) {
			System.out.println(name);
		
		}

	}

}
