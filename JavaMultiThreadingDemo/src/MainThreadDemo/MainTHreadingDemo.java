package MainThreadDemo;


class CA{
	
}

class Printer extends CA implements Runnable{
	@Override
	public void run() {
		
		for(int i=0;i<=10;i++)
		System.out.println("** printer 1 printting.......file-"+i);
	}
}

public class MainTHreadingDemo {

	public MainTHreadingDemo() {
		// TODO Auto-generated constructor stub
	}
	


	public static void main(String[] args) {
		
		System.out.println("==Application Started==");
		
		Runnable pr = new Printer();
	    Thread tr = new Thread(pr);
	   tr.start();
	    

		for(int j=0;j<=10;j++) {
			System.out.println("&& printer 1 printting.......file-"+j);
		}
		
		
		System.out.println("==Application Closed==");
		
		
		
		
	}

}
