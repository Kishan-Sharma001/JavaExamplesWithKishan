package SwingTutorial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonDemo2 extends JFrame implements ActionListener {

	
	
	public JButtonDemo2() {
		
		JButton btn = new JButton("Click Me");
		
		btn.setBounds(100,200,100,40);
		
		add(btn);
		
		setSize(400,400);
		setTitle("Button example with Swing");
		setLayout(null);
		setVisible(true);
		
		
		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		new JButtonDemo2(); 

	}

	

}
