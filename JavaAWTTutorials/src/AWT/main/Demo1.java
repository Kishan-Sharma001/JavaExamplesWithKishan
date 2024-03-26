package AWT.main;

import java.awt.Button;
import java.awt.Frame;

public class Demo1 extends Frame{

	public Demo1() {
		
		 Button b = new Button("Click Me!!");  
		  
	      // setting button position on screen  
	      b.setBounds(80,200,80,30);  
	  
	      // adding button into frame    
	      add(b);  
	  
	      // frame size 300 width and 300 height    
	      setSize(300,300);  
	  
	      // setting the title of Frame  
	      setTitle("Demo-1 Display");   
	          
	      // no layout manager   
	      setLayout(null);   
	  
	      // now frame will be visible, by default it is not visible    
	      setVisible(true);  
	}    
	  

		
		


	public static void main(String[] args) {
		
		Demo1 f = new Demo1(); 
		

	}

}
