package projectFCI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class New_Quiz implements ActionListener {
	JFrame frame = new JFrame();
	JFrame frame2 = new JFrame();
	JButton q = new JButton("Add");
	String b1,b2,b3,b4,b5,b6,b7,b8;
	///////////////////////
	JLabel q1 = new JLabel("q1");
	JLabel q2 = new JLabel("q2");
	JLabel q3 = new JLabel("q3");
	JLabel q4 = new JLabel("q4");
	JLabel c1 = new JLabel("q5");
	JLabel c2 = new JLabel("q6");
	JLabel c3 = new JLabel("q7");
	JLabel c4 = new JLabel("q8");
	///////////////////////
	JLabel q11 = new JLabel("q1");
	JLabel q21 = new JLabel("q2");
	JLabel q31 = new JLabel("q3");
	JLabel q41 = new JLabel("q4");
	JLabel c11 = new JLabel("q5");
	JLabel c21 = new JLabel("q6");
	JLabel c31 = new JLabel("q7");
	JLabel c41 = new JLabel("q8");
	
	
	JTextField t11 = new JTextField();
	JTextField t21 = new JTextField();
	JTextField t31 = new JTextField();
	JTextField t41= new JTextField();
	JTextField t51 = new JTextField();
	JTextField t61 = new JTextField();
	JTextField t71 = new JTextField();
	JTextField t81 = new JTextField();
	////////////////////
	JTextField t1 = new JTextField();
	JTextField t2 = new JTextField();
	JTextField t3 = new JTextField();
	JTextField t4 = new JTextField();
	JTextField t5 = new JTextField();
	JTextField t6 = new JTextField();
	JTextField t7 = new JTextField();
	JTextField t8 = new JTextField();
	
	
	New_Quiz () {
		frame.setLayout(null);
		frame2.setLayout(null);
		q.setBounds(50, 50, 150, 30);
		//c.setBounds(50, 90, 150, 30);
		q1.setBounds(50,150 ,100, 30);
		q2.setBounds(50,190 ,100, 30);
		q3.setBounds(50,230 ,100, 30);
		q4.setBounds(50,270 ,100, 30);
		c1.setBounds(50, 310, 150, 30);
		c2.setBounds(50, 350, 150, 30);
		c3.setBounds(50, 390, 150, 30);
		c4.setBounds(50, 430, 150, 30);
		t1.setBounds(180,150, 130, 30);
		t2.setBounds(180,190, 130, 30);
		t3.setBounds(180,230, 130, 30);
		t4.setBounds(180,270, 130, 30);
		t5.setBounds(180,310, 130, 30);
		t6.setBounds(180,350, 130, 30);
		t7.setBounds(180,390, 130, 30);
		t8.setBounds(180,430, 130, 30);
	/////////////////////////////////////
		q11.setBounds(50,150 ,100, 30);
		q21.setBounds(50,190 ,100, 30);
		q31.setBounds(50,230 ,100, 30);
		q41.setBounds(50,270 ,100, 30);
		c11.setBounds(50, 310, 150, 30);
		c21.setBounds(50, 350, 150, 30);
		c31.setBounds(50, 390, 150, 30);
		c41.setBounds(50, 430, 150, 30);
		
		t11.setBounds(180,150, 130, 30);
		t21.setBounds(180,190, 130, 30);
		t31.setBounds(180,230, 130, 30);
		t41.setBounds(180,270, 130, 30);
		t51.setBounds(180,310, 130, 30);
		t61.setBounds(180,350, 130, 30);
		t71.setBounds(180,390, 130, 30);
		t81.setBounds(180,430, 130, 30);
		
		/////////////////////////////
		frame.add(q);
		frame.add(q1);
		frame.add(q2);
		frame.add(q3);
		frame.add(q4);
		frame2.add(q11);
		frame2.add(q21);
		frame2.add(q31);
		frame2.add(q41);
		frame2.add(c11);
		frame2.add(c21);
		frame2.add(c31);
		frame2.add(c41);
		
		frame2.add(t11);
		frame2.add(t21);
		frame2.add(t31);
		frame2.add(t41);
		frame2.add(t51);
		frame2.add(t61);
		frame2.add(t71);
		frame2.add(t81);
		
		frame.add(c1);
		frame.add(c2);
		frame.add(c3);
		frame.add(c4);
		frame.add(t1);
		frame.add(t2);
		frame.add(t3);
		frame.add(t4);
		frame.add(t5);
		frame.add(t6);
		frame.add(t7);
		frame.add(t8);
		
		q.addActionListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setVisible(true);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setSize(420,420);
		frame2.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==q) {
			b1= t1.getText();
			q11.setText(b1);
			b2= t2.getText();
			q21.setText(b2);
			b3= t3.getText();
			q31.setText(b3);
			b4= t4.getText();
			q41.setText(b4);
			b5= t5.getText();
			c11.setText(b5);
			b6= t6.getText();
			c21.setText(b6);
			b7= t7.getText();
			c31.setText(b7);
			b8= t8.getText();
			c41.setText(b8);
			
		}
		
	}
}
