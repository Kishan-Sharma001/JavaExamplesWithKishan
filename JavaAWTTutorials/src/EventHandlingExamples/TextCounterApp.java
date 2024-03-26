package EventHandlingExamples;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextCounterApp extends Frame implements ActionListener {

	TextArea area;
	Label l1,l2;
	Button b;
	
	
	public TextCounterApp() {
		
		area = new TextArea();
		area.setBounds(100, 200, 200, 150);
		
		l1=new Label("Words :");
		l1.setBounds(100,100,100,30);
		
		l2=new Label("Characters :");
		l2.setBounds(200,100,100,30);
		
		
		
		b= new Button("Count Text");
		b.setBounds(100,500,100,30);
		
		add(area);
		add(l1);
		add(l2);
		add(b);
		b.addActionListener(this);
		
		setSize(400,600);
		setTitle("Text Counter App");
		setLayout(null);
		setVisible(true);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
//	    String text = area.getText();    
//	    String words[]=text.split("\\s");    
//	    l1.setText("Words: "+words.length);    
//	    l2.setText("Characters: "+text.length());  
		System.out.println("hello ");
		
	}

	public static void main(String[] args) {
		TextCounterApp a = new TextCounterApp();

	}

	

}
