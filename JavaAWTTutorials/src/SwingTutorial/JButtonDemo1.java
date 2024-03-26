package SwingTutorial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class JButtonDemo1 extends JFrame implements ActionListener {

	JTextArea area;
	JLabel l1,l2;
	
	
	public JButtonDemo1() {
		area = new JTextArea();
		area.setBounds(100, 200, 300, 200);
		
		l1=new JLabel("Word : ");
		l2=new JLabel("Character : ");
		l1.setBounds(100, 100, 100, 50);
		l2.setBounds(160, 100, 100, 50);
		
		
		
		JButton btn = new JButton("Click Me");
		
		btn.setBounds(100,500,100,40);
		
		btn.addActionListener(this);
		add(area);
		add(btn);
		add(l1);
		add(l2);
		
		setSize(400,400);
		setTitle("Button example with Swing");
		setLayout(null);
		setVisible(true);
		
		
		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String text = area.getText();
		  String words[]=text.split("\\s");    
		    l1.setText("Words: "+words.length);    
		    l2.setText("Characters: "+text.length()); 
		
	}

	public static void main(String[] args) {
		new JButtonDemo1(); 

	}

	

}
