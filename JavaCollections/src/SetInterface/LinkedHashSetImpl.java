package SetInterface;
import java.util.*;

public class LinkedHashSetImpl {

	public LinkedHashSetImpl() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		LinkedHashSet<String>  set = new LinkedHashSet<String>();
		set.add("Black");
		set.add("Green");
		set.add("Red");
		set.add("Yellow");
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()) {
//			String s = itr.next();
			System.out.println(itr.next());
		}
		
		

	}



}
