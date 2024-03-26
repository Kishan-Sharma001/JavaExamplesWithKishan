package EventHandlingExamples;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandlingExample1 extends Frame implements ActionListener {

	TextField tf;
	
	public EventHandlingExample1() {
		
		tf = new TextField();
		
		tf.setBounds(60, 100, 200, 30);
		
		Button btn = new Button("Click me");
		btn.setBounds(60, 130, 60, 30);
		
		btn.addActionListener(this);
		
		add(tf);
		add(btn);
		setSize(400,400);
		setTitle("EventHandling Demo-1");
		setLayout(null);
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		tf.setText("Event Handling Demo-1");
		
	}

	public static void main(String[] args) {
		EventHandlingExample1 d = new EventHandlingExample1();
	}



}
