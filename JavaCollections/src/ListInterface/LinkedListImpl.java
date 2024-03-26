package ListInterface;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListImpl {

	public LinkedListImpl() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
		LinkedList<String> list = new LinkedList<String> ();
		
		list.add("Mango");
		list.add("Apple");
		list.add("Orange");
		list.add("Banana");
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
