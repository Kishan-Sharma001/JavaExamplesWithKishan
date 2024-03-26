package MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapImpl {

	public HashMapImpl() {
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String[] args) {
		HashMap<Integer,String> hs = new HashMap<Integer,String>();
		
		hs.put(101, "Rahul");
		hs.put(102, "Anand");
		hs.put(103, "Ravin");
		hs.put(104, "Chintu");
		
		
		System.out.println("iterating Hashmap using Iterator method");
		
		// convert map into set using entryset() method 
		Set<?> s= hs.entrySet();
		
		Iterator<?> itr = s.iterator();
		
		while (itr.hasNext()) {
			
			// use Map.Entry to get separate values of key and pair 
			Map.Entry entry = (Map.Entry)itr.next();
			
			System.out.println(entry);
		}
		
		
		System.out.println("iterating Hashmap using foreach method");
		
		for (Map.Entry m:hs.entrySet() ) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
