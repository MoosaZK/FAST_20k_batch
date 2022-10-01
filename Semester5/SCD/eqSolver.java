
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class eqSolver {
	
	
	JFrame j = new JFrame("Calculate Hypotenuse");
	JTextField t1 = new JTextField();
	JTextField t2 = new JTextField();
	JTextField t3 = new JTextField();
	JTextField t4 = new JTextField();
	JLabel l1 = new JLabel("Adjacent");
	JLabel l2 = new JLabel("Opposite");
	JLabel l3 = new JLabel("Hypotenuse");
	JButton b = new JButton("SOLVE");

	void btn() {
		
		
		t1.setBounds(50, 30, 50, 30);
		t2.setBounds(150, 30, 50, 30);
		t3.setBounds(250, 30, 50, 30);
		t4.setBounds(100, 200, 100, 30);
		l1.setBounds(20, 30, 50, 30);
		l2.setBounds(120, 30, 50, 30);
		l3.setBounds(220, 30, 50, 30);
		b.setBounds(100, 100, 100, 50);
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1,s2;
				String result;
				s1=t1.getText();
				s2=t2.getText();
				
				Double Adjacent,Opposite,resultf;
				
				Adjacent = Double.parseDouble(s1);
				Opposite = Double.parseDouble(s2);
				
		
				resultf = Math.sqrt((Adjacent*Adjacent)+(Opposite*Opposite));
				result=String.valueOf(resultf);
				t4.setText(result);
				
			}
		});
		
		j.add(b);
		j.add(t1);
		j.add(t2);
		j.add(t3);
		j.add(t4);
		j.add(l1);
		j.add(l2);
		j.add(l3);
		j.setLayout(null);
		j.setSize(400,400);
		j.setVisible(true);
	}
}
